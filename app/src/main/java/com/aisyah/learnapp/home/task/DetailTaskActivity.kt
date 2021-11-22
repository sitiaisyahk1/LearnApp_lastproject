package com.aisyah.learnapp.home.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.listtask.ModelTask
import kotlinx.android.synthetic.main.activity_detail_modules.*
import kotlinx.android.synthetic.main.activity_detail_task.*

class DetailTaskActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_TASK = "extra_task"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_task)
        setSupportActionBar(toolbar_task)

        val task = intent.getParcelableExtra<ModelTask>(EXTRA_TASK) as ModelTask

        tv_title_detailtask.text = task.title
        tv_desc_detailtask.text = task.desc
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}