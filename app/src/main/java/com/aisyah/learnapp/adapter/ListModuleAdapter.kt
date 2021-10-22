package com.aisyah.learnapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.listweb.WebModulesList
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_module.view.*

class ListModuleAdapter(private val listModule: ArrayList<WebModulesList>) : RecyclerView.Adapter<ListModuleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_module, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listModule.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listModule[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: WebModulesList) {
            with(itemView) {
                Glide.with(itemView.context).load(model.img).apply(RequestOptions()).into(iv_weblist)
//                iv_list.setImageResource(model.image)
                label_web.setText(model.lable)
                date_web.setText(model.date)
                tv_tittle_web.setText(model.title)
                tv_desc_web.setText(model.description)
            }
        }

    }

}
