package com.aisyah.learnapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_detail_modules.*
import kotlinx.android.synthetic.main.activity_detail_task.*

class DetailModulesActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MODULE = "extra_module"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_modules)
        setSupportActionBar(toolbar_module)

        val module = intent.getParcelableExtra<ModelModule>(EXTRA_MODULE) as ModelModule

        iv_detail_module.setImageResource(module.img)
        tv_category_module.text = module.category
        tv_date_module.text = module.date
        tv_title_module.text = module.title
        tv_desc_module.text = module.description
        tv_link_module.text = module.linkModule
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}