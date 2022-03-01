package com.aisyah.learnapp.adapter.module.bk

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.learnapp.R
import com.aisyah.learnapp.home.modules.DetailModulesActivity
import com.aisyah.learnapp.model.module.ModelModule
import com.bumptech.glide.Glide

class ListBkAdapter(private val listBk: ArrayList<ModelModule>) : RecyclerView.Adapter<ListBkAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.iv_module)
        var tvLable : TextView = itemView.findViewById(R.id.tv_label_module)
        var tvTitle : TextView = itemView.findViewById(R.id.tv_tittle_module)
        var tvDate : TextView = itemView.findViewById(R.id.tv_date_module)
        var tvDesc : TextView = itemView.findViewById(R.id.tv_desc_module)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListBkAdapter.ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_module, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListBkAdapter.ViewHolder, position: Int) {
        val moduleBk = listBk[position]
        Glide.with(holder.itemView.context).load(moduleBk.img).into(holder.image)

        holder.tvLable.text = moduleBk.lable
        holder.tvTitle.text = moduleBk.title
        holder.tvDate.text = moduleBk.date
        holder.tvDesc.text = moduleBk.description

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailModulesActivity::class.java)
            intent.putExtra(DetailModulesActivity.EXTRA_MODULE, moduleBk)
            it.context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return listBk.size
    }
}


