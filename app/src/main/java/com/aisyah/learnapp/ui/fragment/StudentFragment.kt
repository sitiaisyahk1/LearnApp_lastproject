package com.aisyah.learnapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.student.ListBestStudentAdapter
import com.aisyah.learnapp.adapter.student.ListTopStudentAdapter
import com.aisyah.learnapp.data.BestStudentData
import com.aisyah.learnapp.data.TopStudentData
import com.aisyah.learnapp.model.liststudent.ModelStudent
import kotlinx.android.synthetic.main.fragment_student.*


class StudentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerViewBest()

        initRecyclerViewTop()
    }

    private fun initRecyclerViewBest() {
        val list : ArrayList<ModelStudent> = BestStudentData.getListStudent()
        rv_beststudents.setHasFixedSize(true)
        rv_beststudents.layoutManager = LinearLayoutManager(context)
        val listAdapter = ListBestStudentAdapter()
        listAdapter.setBestStudent(list)
        rv_beststudents.adapter = listAdapter
    }

    private fun initRecyclerViewTop() {
        val list : ArrayList<ModelStudent> = TopStudentData.getListStudent()
        rv_topstudents.setHasFixedSize(true)
        rv_topstudents.layoutManager = LinearLayoutManager(context)
        val listAdapter = ListTopStudentAdapter()
        listAdapter.setTopStudent(list)
        rv_topstudents.adapter = listAdapter
    }

}