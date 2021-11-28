package com.aisyah.learnapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.student.ListBestStudentAdapter
import com.aisyah.learnapp.adapter.task.ListTaskAdapter
import com.aisyah.learnapp.data.BestStudentData
import com.aisyah.learnapp.data.TaskData
import com.aisyah.learnapp.model.liststudent.ModelStudent
import com.aisyah.learnapp.model.listtask.ModelTask
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_rank.*


class StudentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val list : ArrayList<ModelStudent> = BestStudentData.getListStudent()
        rv_beststudents.setHasFixedSize(true)
        rv_beststudents.layoutManager = LinearLayoutManager(context)
        val listAdapter = ListBestStudentAdapter()
        listAdapter.setBestStudent(list)
        rv_beststudents.adapter = listAdapter
    }

}