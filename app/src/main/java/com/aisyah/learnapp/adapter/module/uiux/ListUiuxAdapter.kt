package com.aisyah.learnapp.adapter.module.uiux

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.home.DetailModulesActivity
import com.aisyah.learnapp.model.module.ModelModule
import com.bumptech.glide.Glide

class ListUiuxAdapter(private val listUiux : ArrayList<ModelModule>) : RecyclerView.Adapter<ListUiuxAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.iv_module)
        var tvLable : TextView = itemView.findViewById(R.id.tv_label_module)
        var tvTitle : TextView = itemView.findViewById(R.id.tv_tittle_module)
        var tvDate : TextView = itemView.findViewById(R.id.tv_date_module)
        var tvDesc : TextView = itemView.findViewById(R.id.tv_desc_module)

    }
    override fun onBindViewHolder(holder: ListUiuxAdapter.ViewHolder, position: Int) {
        val moduleUiux = listUiux[position]
        Glide.with(holder.itemView.context).load(moduleUiux.img).into(holder.image)

        holder.tvLable.text = moduleUiux.lable
        holder.tvTitle.text = moduleUiux.title
        holder.tvDate.text = moduleUiux.date
        holder.tvDesc.text = moduleUiux.description

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailModulesActivity::class.java)
            intent.putExtra(DetailModulesActivity.EXTRA_MODULE, moduleUiux)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listUiux.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListUiuxAdapter.ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_module, parent, false)
        return ViewHolder(view)
    }
}
