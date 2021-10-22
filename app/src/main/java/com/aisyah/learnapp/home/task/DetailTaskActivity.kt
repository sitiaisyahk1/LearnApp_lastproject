package com.aisyah.learnapp.home.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.listtask.ListTaskModel
import kotlinx.android.synthetic.main.activity_detail_task.*

class DetailTaskActivity : AppCompatActivity() {
    companion object{
        const val KEY_LIST_TASK = "key_list_task"
    }

    private var model : ListTaskModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_task)

        model = intent.getParcelableExtra(KEY_LIST_TASK)

        supportActionBar?.hide()

        tv_title_detailtask.setText(model?.title)
        tv_desc_detailtask.setText(model?.title)
    }
}