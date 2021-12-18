package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = RecyclerAdapter(applicationContext,"your list of name and desc here")
        val recyclerList = findViewById<RecyclerView>("ID of recycler view") as RecyclerView
        recyclerList.adapter = adapter
        recyclerList.layoutManager = LinearLayoutManager(applicationContext)


    }
}