package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val et4 = findViewById<EditText>(R.id.et4)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val a = arrayOf(et1.text.toString(), et2.text.toString(), et3.text.toString(), et4.text.toString())
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("a", a)
            startActivity(i)
        }
    }
}