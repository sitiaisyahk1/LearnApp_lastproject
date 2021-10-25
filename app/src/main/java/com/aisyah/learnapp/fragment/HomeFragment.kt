package com.aisyah.learnapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.task.ListTaskAdapter
import com.aisyah.learnapp.home.modules.WebListActivity
import com.aisyah.learnapp.home.task.DetailTaskActivity
import com.aisyah.learnapp.model.listtask.ListTaskModel
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var taskAdapter: ListTaskAdapter

//    companion object {
//        fun defaultFragment() : HomeFragment {
//            val fragment = HomeFragment()
//            val bundle = Bundle()
//            fragment.arguments = bundle
//            return fragment
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

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

        showRecycleList()

    }

    private fun getListTask(): ArrayList<ListTaskModel> {
        val title = resources.getStringArray(R.array.title_task)
        val category = resources.getStringArray(R.array.category_task)
        val time = resources.getStringArray(R.array.time_task)
        val image = resources.obtainTypedArray(R.array.image_task)

        val listTask = ArrayList<ListTaskModel>()

        for (position in title.indices){
            val task = ListTaskModel(
                title[position],
                time[position],
                category[position],
                image.getResourceId(position, -1)
            )
            listTask.add(task)
        }
        return listTask
    }

    private fun showRecycleList() {
        taskAdapter = ListTaskAdapter { showSelected(it) }
        taskAdapter.notifyDataSetChanged()
        taskAdapter.setData(getListTask())
        rv_newest_task.setHasFixedSize(true)
        rv_newest_task.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//        val adapter = Adapter(foodList)
        rv_newest_task.adapter = taskAdapter
    }

    private fun showSelected(it: ListTaskModel) {
        val page = Intent(context, DetailTaskActivity::class.java)
        page.putExtra(DetailTaskActivity.KEY_LIST_TASK, it)
        startActivity(page)
    }


}