package com.aisyah.learnapp.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.task.ListTaskAdapter
import com.aisyah.learnapp.data.TaskData
import com.aisyah.learnapp.home.modules.*
import com.aisyah.learnapp.model.listtask.ModelTask
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_webcategory.setOnClickListener {
            val intent = Intent(context, WebListActivity::class.java)
            startActivity(intent)
        }

        btn_mobilecategory.setOnClickListener {
            val intent = Intent(context, MobileListActivity::class.java)
            startActivity(intent)
        }

        btn_uiuxcategory.setOnClickListener {
            val intent = Intent(context, UiuxListActivity::class.java)
            startActivity(intent)
        }
        btn_bkcategory.setOnClickListener {
            val intent = Intent(context, BkListActivity::class.java)
            startActivity(intent)
        }
        btn_diniyahcategory.setOnClickListener {
            val intent = Intent(context, DiniyahListActivity::class.java)
            startActivity(intent)
        }

        initRecyclerView()

    }


    private fun initRecyclerView() {
        val list : ArrayList<ModelTask> = TaskData.getListTask()
        Log.d("terserahh", "$list")
        rv_task.setHasFixedSize(true)
        rv_task.layoutManager = LinearLayoutManager(context)
        val listAdapter = ListTaskAdapter()
        listAdapter.setTask(list)
        rv_task.adapter = listAdapter
    }



}