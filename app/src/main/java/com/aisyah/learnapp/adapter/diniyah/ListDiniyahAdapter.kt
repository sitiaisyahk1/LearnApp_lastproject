package com.aisyah.learnapp.adapter.diniyah

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

class ListDiniyahAdapter(private val listDiniyah: ArrayList<ModelModule>) : RecyclerView.Adapter<ListDiniyahAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.iv_module)
        var tvLable : TextView = itemView.findViewById(R.id.tv_label_module)
        var tvTitle : TextView = itemView.findViewById(R.id.tv_tittle_module)
        var tvDate : TextView = itemView.findViewById(R.id.tv_date_module)
        var tvDesc : TextView = itemView.findViewById(R.id.tv_desc_module)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDiniyahAdapter.ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_module, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListDiniyahAdapter.ViewHolder, position: Int) {
        val moduleDiniyah = listDiniyah[position]
        Glide.with(holder.itemView.context).load(moduleDiniyah.img).into(holder.image)

        holder.tvLable.text = moduleDiniyah.lable
        holder.tvTitle.text = moduleDiniyah.title
        holder.tvDate.text = moduleDiniyah.date
        holder.tvDesc.text = moduleDiniyah.description

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailModulesActivity::class.java)
            intent.putExtra(DetailModulesActivity.EXTRA_MODULE, moduleDiniyah)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listDiniyah.size
    }
}