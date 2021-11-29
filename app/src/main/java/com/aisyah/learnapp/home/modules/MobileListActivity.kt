package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.module.mobile.ListMobileAdapter
import com.aisyah.learnapp.data.ModuleMobileData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_mobile_list.*

class MobileListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_list)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val list : ArrayList<ModelModule> = arrayListOf()
        rv_listmodules_mobile.setHasFixedSize(true)
        list.addAll(ModuleMobileData.listDataMobile)
        rv_listmodules_mobile.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListMobileAdapter(list)
        rv_listmodules_mobile.adapter = listAdapter
    }
}