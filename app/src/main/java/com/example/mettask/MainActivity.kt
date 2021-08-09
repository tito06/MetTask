package com.example.mettask

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val dataList = ArrayList<DataModel>()
    private val itemList = ArrayList<ItemModel>()

    private lateinit var dataAdapter: DataAdapter
    private lateinit var itemAdapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        dataAdapter = DataAdapter(dataList)
        recyclerView.adapter = dataAdapter
        feedDataToList()

        val itemRecyclerView:RecyclerView = findViewById(R.id.item_recyclerview)
        itemAdapter = ItemAdapter(itemList)
        val layoutManager = LinearLayoutManager(applicationContext)
        itemRecyclerView.layoutManager = layoutManager
        itemRecyclerView.adapter = itemAdapter
        feedItemData()
    }

    private fun feedDataToList(){

        var data = DataModel("All")
        dataList.add(data)

        data = DataModel("Category New")
        dataList.add(data)

        data = DataModel("Stationary")
        dataList.add(data)

        data = DataModel("Fruits")
        dataList.add(data)

        data = DataModel("Grocery")
        dataList.add(data)
    }

    private fun feedItemData(){

        var item = ItemModel("Sanitizer", "Category New", "$ 12", R.drawable.home2)
        itemList.add(item)

        item = ItemModel("Juice", "food", "$ 10", R.drawable.home2)
        itemList.add(item)

        item = ItemModel("Oil", "Grocery", "$ 20", R.drawable.home2)
        itemList.add(item)

        item = ItemModel("Shirt", "Cloth", "$ 15", R.drawable.home2)
        itemList.add(item)

        item = ItemModel("Tomato", "Fruit", "$ 18", R.drawable.home2)
        itemList.add(item)
    }
}