package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btPhoneButton1 = findViewById<ImageButton>(R.id.btPhoneButton1)
        val edPhoneNumber = findViewById<EditText>(R.id.editTextPhone)

        btPhoneButton1.setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java).putExtra(
                    "result",
                    edPhoneNumber.text.toString()
                )
            )
        }
    }
}