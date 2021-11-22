package com.aisyah.learnapp.adapter.web

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.home.DetailModulesActivity
import com.aisyah.learnapp.model.webmodule.ModelModule
import com.bumptech.glide.Glide

class ListWebAdapter(private val listModule: ArrayList<ModelModule>) : RecyclerView.Adapter<ListWebAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image : ImageView = itemView.findViewById(R.id.iv_module)
        var tvLable : TextView = itemView.findViewById(R.id.tv_label_module)
        var tvTitle : TextView = itemView.findViewById(R.id.tv_tittle_module)
        var tvDate : TextView = itemView.findViewById(R.id.tv_date_module)
        var tvDesc : TextView = itemView.findViewById(R.id.tv_desc_module)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_module, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val moduleWeb = listModule[position]
        Glide.with(holder.itemView.context).load(moduleWeb.img).into(holder.image)

        holder.tvLable.text = moduleWeb.lable
        holder.tvTitle.text = moduleWeb.title
        holder.tvDate.text = moduleWeb.date
        holder.tvDesc.text = moduleWeb.description

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailModulesActivity::class.java)
            intent.putExtra(DetailModulesActivity.EXTRA_MODULE, moduleWeb)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listModule.size
    }


}
