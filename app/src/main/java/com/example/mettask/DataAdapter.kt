package com.example.mettask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private var dataList: List<DataModel>):
RecyclerView.Adapter<DataAdapter.MyViewHolder>(){


     class MyViewHolder(view:View): RecyclerView.ViewHolder(view){
         var title: TextView = view.findViewById(R.id.title)
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.data_list, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        holder.title.text = data.getTitle()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}