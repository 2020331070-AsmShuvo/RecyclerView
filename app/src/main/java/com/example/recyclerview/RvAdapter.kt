package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//custom adapter

class RvAdapter(val songs: List<String>) : RecyclerView.Adapter<RvAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        /* creaters view and returns */
        /* making a inflater for creating view */
        /* layoutinflater coverts a xml file into java object */
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.rv_item, parent, false) /*view bangaya*/
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        /*dataBind: */
        holder.textTitle.text = songs[position]
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textTitle = itemView.findViewById<TextView>(R.id.nameID)
        var textAddress = itemView.findViewById<TextView>(R.id.adressID)
        var image_view = itemView.findViewById<ImageView>(R.id.profile)


    }

}

