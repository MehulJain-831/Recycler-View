package com.example.recycler_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val context: Context, val data: List<Data>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate("Id of xml file of layout item here", parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = data[position]
//        Set the values here .... beow is an example
        holder.desc.text = data.name

    }

    override fun getItemCount(): Int {
        return data.size
    }

    class  ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var desc = view.findViewById<ImageView>("put the id of description from xml file of layout")
        var name = view.findViewById<TextView>("put the ID of name from xml file here")
    }
}