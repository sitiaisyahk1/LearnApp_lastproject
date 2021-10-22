package com.aisyah.learnapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aisyah.learnapp.R
import com.aisyah.learnapp.account.AboutAppActivity
import com.aisyah.learnapp.account.EditAccountActivity
import com.aisyah.learnapp.home.modules.WebListActivity
import kotlinx.android.synthetic.main.fragment_account.*


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_editprofile.setOnClickListener {
            val intent = Intent(context, EditAccountActivity::class.java)
            startActivity(intent)
        }

        btn_aboutapp.setOnClickListener {
            val intent = Intent(context, AboutAppActivity::class.java)
            startActivity(intent)
        }
    }

}