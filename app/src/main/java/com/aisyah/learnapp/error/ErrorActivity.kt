package com.aisyah.learnapp.error

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aisyah.learnapp.R
import com.aisyah.learnapp.ui.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_error.*
import kotlinx.android.synthetic.main.fragment_home.*

class ErrorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        errorBtn.setOnClickListener {
            val intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)
        }
    }
}