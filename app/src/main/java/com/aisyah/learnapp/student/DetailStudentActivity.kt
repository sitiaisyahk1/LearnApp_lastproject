package com.aisyah.learnapp.student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.liststudent.ModelStudent
import kotlinx.android.synthetic.main.activity_detail_student.*

class DetailStudentActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_STUDENT = "extra_student"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_student)

        val student = intent.getParcelableExtra<ModelStudent>(DetailStudentActivity.EXTRA_STUDENT) as ModelStudent

        iv_detail_student.setImageResource(student.img)
        tv_detail_username.text = student.name
        tv_detail_like.text = student.like
        tv_detail_desc_student.text = student.desc
    }
}