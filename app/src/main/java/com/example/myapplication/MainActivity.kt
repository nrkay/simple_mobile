package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val groupButton = findViewById<RadioGroup>(R.id.radioGroupMenu)
        val result = findViewById<TextView>(R.id.result)

//        method untuk groupButton setOnCheckedListener
        groupButton.setOnCheckedChangeListener{ group, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
            val textSelect = radioButton.text.toString()
            result.setText("Pilihan anda adalah $textSelect")

        }




    }
}