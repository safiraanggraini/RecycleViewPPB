package com.example.recyclerview_pert5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistt.R

class MainActivity : AppCompatActivity() {
    private  lateinit var rvKampus: RecyclerView
    private var list: ArrayList<Kampus> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKampus = findViewById(R.id.Rv_kampus)
        rvKampus.setHasFixedSize(true)

        list.addAll(DataKampus.listData)
//        showRecyclerViewListMode()
//        showRecyclerViewGridMode()
        showRecyclerViewCardMode()
    }

    private fun showRecyclerViewListMode(){
        rvKampus.layoutManager = LinearLayoutManager(this)
        val listKampusAdapter = ListKampusAdapter(list)
        rvKampus.adapter = listKampusAdapter
    }

    private fun showRecyclerViewCardMode(){
        rvKampus.layoutManager = LinearLayoutManager(this)
        val CardKampusAdapter = CardKampusAdapter(list)
        rvKampus.adapter = CardKampusAdapter
    }
}
