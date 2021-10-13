package com.aisyah.learnapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aisyah.learnapp.R
import com.aisyah.learnapp.home.DetailModulesActivity
import com.aisyah.learnapp.utils.onNavDestinationSelected
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_webcategory.setOnClickListener {
            val intent = Intent(context, DetailModulesActivity::class.java)
            startActivity(intent)
        }
    }

}