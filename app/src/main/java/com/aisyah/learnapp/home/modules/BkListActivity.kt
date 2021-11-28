package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.bk.ListBkAdapter
import com.aisyah.learnapp.data.ModuleBkData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_bk_list.*

class BkListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bk_list)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val list : ArrayList<ModelModule> = arrayListOf()
        rv_listmodules_bk.setHasFixedSize(true)
        list.addAll(ModuleBkData.listDataBk)
        rv_listmodules_bk.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListBkAdapter(list)
        rv_listmodules_bk.adapter = listAdapter
    }
}