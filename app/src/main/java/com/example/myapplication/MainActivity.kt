package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
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
        val menuCoffee = findViewById<CheckBox>(R.id.minumCoffee)
        val menuJus = findViewById<CheckBox>(R.id.minumJus)
        val menuMineral = findViewById<CheckBox>(R.id.minumMineral)
        val btnChackOut = findViewById<Button>(R.id.btnCheckOut)


//        Mendapatkan string dari checkbox yang akan dipilih
        val textCoffee = menuCoffee.isChecked
        val textJuss = menuJus.isChecked
        val textMineral = menuMineral.isChecked

// Membuat variabel untuk menyimpan teks dari RadioButton yang dipilih
        var resultString = ""

//        menjalankan radioGroup ketika di klk oleh user
            groupButton.setOnCheckedChangeListener{ group, checkedId ->
                val radioButton = findViewById<RadioButton>(checkedId)
                resultString = radioButton.text.toString()

            }

        // Mendengarkan perubahan CheckBox dan mengumpulkan teks yang dipilih
        val selectedCheckBoxesText = StringBuilder()
        menuCoffee.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                selectedCheckBoxesText.append("Coffee\n")
            }
        }

        menuJus.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                selectedCheckBoxesText.append("Jus\n")
            }
        }

        menuMineral.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                selectedCheckBoxesText.append("Mineral\n")
            }
        }


        btnChackOut.setOnClickListener{
//            variabel selectedCheckBoxesText berupa object, untuk menampilkannya digunakan toString() untuk diubah ke string
            val resultPesanan = "Pesanan Anda:\n $resultString\n${selectedCheckBoxesText.toString()}"
            result.text = resultPesanan
        }






    }
}