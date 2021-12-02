package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.module.bk.ListBkAdapter
import com.aisyah.learnapp.data.ModuleBkData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_bk_list.*
import kotlinx.android.synthetic.main.activity_detail_modules.*

class BkListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bk_list)
        setSupportActionBar(toolbar_bk)

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}