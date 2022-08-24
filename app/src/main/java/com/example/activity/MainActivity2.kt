package com.example.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val editTextPhone2 = findViewById<TextView>(R.id.editTextPhone2)
        val btPhoneButton2 = findViewById<ImageButton>(R.id.btPhoneButton2)

        btPhoneButton2.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().apply {
                putExtra("result", "1010101")
            })
            finish()
        }
    }
}