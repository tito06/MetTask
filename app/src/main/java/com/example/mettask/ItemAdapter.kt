package com.example.mettask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private var itemList: List<ItemModel>):
RecyclerView.Adapter<ItemAdapter.MyViewHolder>(){


     class MyViewHolder(view:View): RecyclerView.ViewHolder(view){
         var title: TextView = view.findViewById(R.id.title)
         var category: TextView = view. findViewById(R.id.category)
         var price:TextView = view.findViewById(R.id.price)
         var photo:ImageView = view.findViewById(R.id.photo)

     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = itemList[position]
        holder.title.text = data.getTitle()
        holder.price.text = data.getPrice()
        holder.category.text = data.getCategory()
        holder.photo.setImageResource(data.photo)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}