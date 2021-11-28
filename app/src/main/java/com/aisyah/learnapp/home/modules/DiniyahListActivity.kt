package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.diniyah.ListDiniyahAdapter
import com.aisyah.learnapp.data.ModuleDiniyahData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_diniyah_list.*

class DiniyahListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diniyah_list)

        initRecyclerView()
    }
    private fun initRecyclerView() {
        val list : ArrayList<ModelModule> = arrayListOf()
        rv_listmodules_diniyah.setHasFixedSize(true)
        list.addAll(ModuleDiniyahData.listDataDiniyah)
        rv_listmodules_diniyah.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListDiniyahAdapter(list)
        rv_listmodules_diniyah.adapter = listAdapter
    }
}