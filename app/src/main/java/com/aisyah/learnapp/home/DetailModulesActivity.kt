package com.aisyah.learnapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_detail_modules.*
import kotlinx.android.synthetic.main.activity_detail_student.*
import kotlinx.android.synthetic.main.activity_detail_task.*

class DetailModulesActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MODULE = "extra_module"
    }

    var handler: Handler? = null
    var hour: TextView? = null
    var minute: TextView? = null
    var seconds: TextView? = null
    var milli_seconds: TextView? = null

    internal var MillisecondTime: Long = 0
    internal var StartTime: Long = 0
    internal var TimeBuff: Long = 0
    internal var UpdateTime = 0L


    internal var Seconds: Int = 0
    internal var Minutes: Int = 0
    internal var MilliSeconds: Int = 0

    internal var flag:Boolean=false

    var startButton: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_modules)
        setSupportActionBar(toolbar_module)

        startButton = findViewById(R.id.btn_play)
        bindViews()

        val module = intent.getParcelableExtra<ModelModule>(EXTRA_MODULE) as ModelModule

        iv_detail_module.setImageResource(module.img)
        tv_category_module.text = module.category
        tv_date_module.text = module.date
        tv_title_module.text = module.title
        tv_desc_module.text = module.description
        tv_link_module.text = module.linkModule
    }

    private fun bindViews() {
        hour = findViewById(R.id.hour)
        minute = findViewById(R.id.minute)
        seconds = findViewById(R.id.seconds)


        startButton?.setOnClickListener {
            if (flag){
                handler?.removeCallbacks(runnable)
                startButton?.setImageResource(R.drawable.ic_play)
                flag=false
            }else{
                startButton?.setImageResource(R.drawable.ic_reset)
                StartTime = SystemClock.uptimeMillis()
                handler?.postDelayed(runnable, 0)
                flag=true
            }
        }

        handler = Handler()
    }

    var runnable: Runnable = object : Runnable {

        override fun run() {

            MillisecondTime = SystemClock.uptimeMillis() - StartTime

            UpdateTime = TimeBuff + MillisecondTime

            Seconds = (UpdateTime / 1000).toInt()

            Minutes = Seconds / 60

            Seconds = Seconds % 60


            if (Minutes.toString().length < 2) {
                minute?.text = "0" + Minutes.toString()
            } else {
                minute?.text = Minutes.toString()
            }
            if (Seconds.toString().length < 2) {
                seconds?.text = "0" + Seconds.toString()
            } else {
                seconds?.text = Seconds.toString()
            }

            milli_seconds?.text = MilliSeconds.toString()

            handler?.postDelayed(this, 0)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}