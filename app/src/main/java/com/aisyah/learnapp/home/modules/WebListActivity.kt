package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.web.ListWebAdapter
import com.aisyah.learnapp.data.ModuleWebData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_web_list.*

class WebListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_list)

        initRecylerView()

    }

    private fun initRecylerView() {
        val list : ArrayList<ModelModule> = arrayListOf()
        rv_listmodules_web.setHasFixedSize(true)
        list.addAll(ModuleWebData.listDataWeb)
        rv_listmodules_web.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListWebAdapter(list)
        rv_listmodules_web.adapter = listAdapter
    }
}