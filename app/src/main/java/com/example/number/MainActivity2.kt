package com.example.number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton=findViewById<Button>(R.id.rollButton)
        val resultText=findViewById<TextView>(R.id.resultsTextView)
        val seekBar=findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            val rand= Random().nextInt(seekBar.progress)
            resultText.text=rand.toString()
        }
    }
}