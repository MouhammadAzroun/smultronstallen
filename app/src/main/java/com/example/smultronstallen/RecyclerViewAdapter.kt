package com.example.smultronstallen

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val context: Context, val places : List<Place>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = places[position]
        holder.heading.text = place.heading
    }

    override fun getItemCount(): Int {
        return places.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val heading = itemView.findViewById<TextView>(R.id.headingTextView)
        var listItemPosition = 0

    }
}