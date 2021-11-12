package com.example.cse_224_ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Problem_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem2)

        var Etxt = findViewById<EditText>(R.id.et1)
        var Btn = findViewById<Button>(R.id.Btn1)
        var RBtn = findViewById<RadioButton>(R.id.rBtn1)
        var CBox =findViewById<CheckBox>(R.id.cBox1)

        Etxt.setOnClickListener {
            Toast.makeText(applicationContext,"You selected EditText",Toast.LENGTH_LONG).show()
        }

        Btn.setOnClickListener {
            Toast.makeText(applicationContext,"You Clicked Button",Toast.LENGTH_LONG).show()
            CBox.setChecked(false)
            RBtn.setChecked(false)
        }

        RBtn.setOnClickListener {
            Toast.makeText(applicationContext,"You selected RadioButton",Toast.LENGTH_LONG).show()
            CBox.setChecked(false)
        }

        CBox.setOnClickListener {
            Toast.makeText(applicationContext,"You selected CheckBox", Toast.LENGTH_LONG).show()
            RBtn.setChecked(false)
        }
    }
}