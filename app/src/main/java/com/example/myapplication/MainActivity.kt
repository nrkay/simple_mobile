package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.inputText)
        val btnClick = findViewById<Button>(R.id.btnClick)
        var num = 0
        btnClick.setOnClickListener{
            val name = inputText.text.toString()
            num++
            inputText.setText("Jumlah Click : $num")
        }
    }
}