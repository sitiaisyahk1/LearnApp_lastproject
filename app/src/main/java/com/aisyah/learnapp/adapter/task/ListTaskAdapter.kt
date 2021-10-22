package com.aisyah.learnapp.adapter.task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.listtask.ListTaskModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_task.view.*

class ListTaskAdapter(private val listener: (ListTaskModel) -> Unit) : RecyclerView.Adapter<ListTaskAdapter.ViewHolder>() {
    private val listTask = ArrayList<ListTaskModel>()

    fun setData(items: ArrayList<ListTaskModel>) {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_task, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listTask.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTask[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: ListTaskModel, listener: (ListTaskModel) -> Unit) {
            with(itemView) {
                Glide.with(itemView.context).load(model.img).apply(RequestOptions()).into(iv_list_task)
                tv_title_task.setText(model.title)
                tv_category_task.setText(model.category)
                tv_time_task.setText(model.time)

                itemView.setOnClickListener{(listener(model))}
            }
        }

    }

}
