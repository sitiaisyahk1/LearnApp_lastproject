package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.module.mobile.ListMobileAdapter
import com.aisyah.learnapp.data.ModuleMobileData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_detail_modules.*
import kotlinx.android.synthetic.main.activity_mobile_list.*

class MobileListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_list)
        setSupportActionBar(toolbar_mobile)

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}