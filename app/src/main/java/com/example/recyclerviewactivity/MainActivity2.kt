package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    lateinit var adapter: RV
    lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val extra = intent.extras
        if(extra != null){
            val a = extra.getStringArray("a")!!

            rvMain = findViewById(R.id.rvMain)

            adapter = RV(a)
            rvMain.adapter = adapter
            rvMain.layoutManager = LinearLayoutManager(this)
        }


    }
}