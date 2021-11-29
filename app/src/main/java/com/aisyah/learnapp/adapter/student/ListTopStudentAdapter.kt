package com.aisyah.learnapp.adapter.student

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.adapter.student.ListTopStudentAdapter.*
import com.aisyah.learnapp.model.liststudent.ModelStudent
import com.aisyah.learnapp.student.DetailStudentActivity
import com.bumptech.glide.Glide

class ListTopStudentAdapter : RecyclerView.Adapter<ViewHolder>() {

    private val listStudent = arrayListOf<ModelStudent>()

    fun setTopStudent(students: List<ModelStudent>?) {
        if (students == null) return
        listStudent.clear()
        listStudent.addAll(students)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivImage: ImageView = itemView.findViewById(R.id.iv_best_student)
        var tvName: TextView = itemView.findViewById(R.id.tv_name_student_best)
        var tvRank: TextView = itemView.findViewById(R.id.tv_beston)
        var tvPoint: TextView = itemView.findViewById(R.id.tv_point_best)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTopStudentAdapter.ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_students, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListTopStudentAdapter.ViewHolder, position: Int) {
        val student = listStudent[position]
        Glide.with(holder.itemView.context).load(student.img).into(holder.ivImage)

        holder.tvName.text = student.name
        holder.tvPoint.text = student.point
        holder.tvRank.text = student.rank

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailStudentActivity::class.java)
            intent.putExtra(DetailStudentActivity.EXTRA_STUDENT, student)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}