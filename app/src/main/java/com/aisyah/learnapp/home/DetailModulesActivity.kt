package com.aisyah.learnapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.listweb.ModulesDetail

class DetailModulesActivity : AppCompatActivity() {
//    companion object{
//        const val KEY_MODULES_WEB = "key_modules_web"
//    }

    private var model : ModulesDetail? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_modules)

//        model = intent.getParcelableExtra(KEY_MODULES_WEB)
//
//        tv_category_module.setText(model?.category)
//        tv_date_module.setText(model?.date)
//        tv_title_module.setText(model?.title)
//        tv_desc_module.setText(model?.description)
//        tv_link_module.setText(model?.linkModule)
//        iv_detail_module.setImageResource(model?.img!!)
    }
}