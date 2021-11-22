package com.aisyah.learnapp.adapter.task

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.home.task.DetailTaskActivity
import com.aisyah.learnapp.model.listtask.ModelTask
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_task.view.*

class ListTaskAdapter(private val listTask: ArrayList<ModelTask>) : RecyclerView.Adapter<ListTaskAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivImage : ImageView = itemView.findViewById(R.id.iv_list_task)
        var tvCategory : TextView = itemView.findViewById(R.id.tv_category_task)
        var tvTitle : TextView = itemView.findViewById(R.id.tv_title_task)
        var tvTime : TextView = itemView.findViewById(R.id.tv_time_task)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_task, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTask.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task = listTask[position]
        Glide.with(holder.itemView.context).load(task.img).into(holder.ivImage)

        holder.tvCategory.text = task.category
        holder.tvTitle.text = task.title
        holder.tvTime.text = task.time

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailTaskActivity::class.java)
            intent.putExtra(DetailTaskActivity.EXTRA_TASK, task)
            it.context.startActivity(intent)
        }
    }


}
