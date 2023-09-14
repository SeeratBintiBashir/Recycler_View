package com.example.recyclerviewproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SortedList

class MainActivity : AppCompatActivity() {
    lateinit var songList: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        songList = findViewById(R.id.songList)


        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Memories","Maroon 5"))
        songsObjects.add(Song("On & On","Cartoon, Daniel Levi"))
        songsObjects.add(Song("Thunder","Imagine Dragons"))
        songsObjects.add(Song("Play","Alan Walker"))
        songsObjects.add(Song("Indian Summer","Jai Wolf"))
        songsObjects.add(Song("Happier","Marshmello "))
        songsObjects.add(Song("My Life Is Going","Cecilia Krull"))
        songsObjects.add(Song("Firefly","When Chai Met Toast"))
        songsObjects.add(Song("Alone","Alan Walker"))
        songsObjects.add(Song("Whatever It Takes","Imagine Dragons"))
        songsObjects.add(Song("Believer","Imagine Dragons"))
        songsObjects.add(Song("Faded","Alan Walker"))

        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager =LinearLayoutManager(this)
    }
}