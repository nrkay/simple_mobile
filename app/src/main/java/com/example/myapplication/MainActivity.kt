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
        val input1 = findViewById<EditText>(R.id.inputPertama)
        val input2 = findViewById<EditText>(R.id.inputKedua)
        val btn = findViewById<Button>(R.id.btn)
        val hasil = findViewById<TextView>(R.id.hasil)



        btn.setOnClickListener{
            val bil1 = input1.text.toString().toInt()
            val bil2 = input2.text.toString().toInt()
            val hasilPenjumlahan = bil1 + bil2
            hasil.text = hasilPenjumlahan.toString()
        }


    }
}