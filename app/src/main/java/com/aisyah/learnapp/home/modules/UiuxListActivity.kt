package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.module.uiux.ListUiuxAdapter
import com.aisyah.learnapp.data.ModuleUiuxData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_uiux.*

class UiuxListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uiux)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val list : ArrayList<ModelModule> = arrayListOf()
        rv_listmodules_uiux.setHasFixedSize(true)
        list.addAll(ModuleUiuxData.listDataUiux)
        rv_listmodules_uiux.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListUiuxAdapter(list)
        rv_listmodules_uiux.adapter = listAdapter
    }
}