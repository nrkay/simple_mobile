package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textToast = findViewById<Button>(R.id.btnToast)
        val templateToasr = findViewById<Button>(R.id.templateToast)
//        val csToast = findViewById<ConstraintLayout>(R.id.toastTemplate)

//        membuat toast biasa
        textToast.setOnClickListener{
            Toast.makeText(this, "Ini adalah toast", Toast.LENGTH_SHORT).show()
        }

//        membuat template toast
        templateToasr.setOnClickListener{
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = layoutInflater.inflate(R.layout.template_toast,  findViewById<ConstraintLayout>(R.id.toastTemplate))
                show()
            }
        }


    }
}