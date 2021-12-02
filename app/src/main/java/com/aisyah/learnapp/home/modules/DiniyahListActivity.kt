package com.aisyah.learnapp.home.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.module.diniyah.ListDiniyahAdapter
import com.aisyah.learnapp.data.ModuleDiniyahData
import com.aisyah.learnapp.model.module.ModelModule
import kotlinx.android.synthetic.main.activity_detail_modules.*
import kotlinx.android.synthetic.main.activity_diniyah_list.*

class DiniyahListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diniyah_list)
        setSupportActionBar(toolbar_diniyah)

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}