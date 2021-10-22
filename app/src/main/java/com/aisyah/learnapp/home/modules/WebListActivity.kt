package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.ListModuleAdapter
import com.aisyah.learnapp.model.listweb.WebModulesList
import kotlinx.android.synthetic.main.activity_web_list.*

class WebListActivity : AppCompatActivity() {

//    private lateinit var moduleWebAdapter : Adapter
    private val listModule = ArrayList<WebModulesList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_list)

        showRecycleList()
        rv_listmodules_web.setHasFixedSize(true)
        listModule.addAll(getListModule())

    }

    private fun getListModule(): ArrayList<WebModulesList> {
        val lable1 = resources.getStringArray(R.array.lable_web_modules)
        val date1 = resources.getStringArray(R.array.date_web_modules)
        val title = resources.getStringArray(R.array.title_web_modules)
        val desc = resources.getStringArray(R.array.decription_web_modules)
        val image = resources.obtainTypedArray(R.array.image_web_modules)

        val listWebModule = ArrayList<WebModulesList>()

        for (position in lable1.indices){
            val module = WebModulesList(
                title[position],
                lable1[position],
                date1[position],
                desc[position],
                image.getResourceId(position, -1)
            )
            listWebModule.add(module)
        }
        return listWebModule
    }


    private fun showRecycleList() {
        rv_listmodules_web.setHasFixedSize(true)
        rv_listmodules_web.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_listmodules_web.adapter = ListModuleAdapter(listModule)
    }

    private fun showSelected(it: WebModulesList) {
//        val page = Intent(this, WebListActivity::class.java)
//        page.putExtra(DetailModulesActivity.KEY_MODULES_WEB, it)
//        startActivity(page)
    }
}