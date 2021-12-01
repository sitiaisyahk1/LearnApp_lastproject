package com.aisyah.learnapp.student

import android.content.Intent
import android.net.Uri
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

    fun getUrlFromGithub(view: android.view.View) {
        val url = "https://github.com/sitiaisyahk1"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    fun getUrlFromLinkedin(view: android.view.View) {
        val url = "https://www.linkedin.com/in/sitiaisyah-k-70577019b/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    fun getUrlFromBehance(view: android.view.View) {
        val url = "https://www.behance.net/sitiaisyah0025"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}