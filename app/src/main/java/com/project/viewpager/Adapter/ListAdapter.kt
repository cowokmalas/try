package com.project.viewpager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.viewpager.NewList
import com.project.viewpager.R

class ListAdapter(private var lis:ArrayList<NewList>) :RecyclerView.Adapter<ListAdapter.ListViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lis.size

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val list=lis[position]
        holder.tvName.text=list.name
        holder.tvDesk.text=list.desk

    }

    inner class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val tvName:TextView=itemView.findViewById(R.id.tv_name)
        val tvDesk:TextView=itemView.findViewById(R.id.tv_deskripsi)

    }
}