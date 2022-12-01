package com.example.creditcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var name:EditText
    private lateinit var first:EditText
    private lateinit var second:EditText
    private lateinit var third:EditText
    private lateinit var fourth:EditText
    private lateinit var month:EditText
    private lateinit var year:EditText
    private lateinit var cvv:EditText
    private lateinit var pay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        first = findViewById(R.id.first)
        second = findViewById(R.id.second)
        third = findViewById(R.id.third)
        fourth = findViewById(R.id.fourth)
        month = findViewById(R.id.month)
        year = findViewById(R.id.year)
        cvv = findViewById(R.id.cvv)
        pay = findViewById(R.id.pay)

        pay.setOnClickListener {
            if(name.text.toString() !== "" && first.text.toString().isDigitsOnly() &&
                first.text.toString().length == 4 && second.text.toString().isDigitsOnly()
                && second.text.toString().length == 4 && third.text.toString().isDigitsOnly()
                && third.text.toString().length == 4 && fourth.text.toString().isDigitsOnly()
                && fourth.text.toString().length == 4 && cvv.text.toString().isDigitsOnly()
                && cvv.text.toString().length == 3 && month.text.toString().toInt() >= 1
                && month.text.toString().toInt() <= 12 && month.text.toString().isDigitsOnly()
                && year.text.toString().toInt() >= 2022 && year.text.toString().isDigitsOnly()){
                Toast.makeText(this, "თქვენი ტრანზაქცია წარმატებულია", Toast.LENGTH_SHORT).show()
            }
        }
    }
}