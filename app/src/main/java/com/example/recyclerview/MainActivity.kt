package com.example.recyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/*
* 1. Add recycler view in xml
* 2. make itemView
* 3. data model
* 4. adapter
* 5. data list
*
* */

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songs = listOf(
            "hello","Laptop","Dance","Chill","Coders life", "Quarantine"
        )
        var play = findViewById<RecyclerView>(R.layout.activity_main)
        play.adapter = RvAdapter(songs)
        play.layoutManager =  LinearLayoutManager(this)



    }
}