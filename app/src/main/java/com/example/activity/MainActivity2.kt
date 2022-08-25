package com.example.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val editTextPhone2 = findViewById<TextView>(R.id.editTextPhone2)
        val btCallButton2 = findViewById<ImageButton>(R.id.btPhoneButton2)
        var data: String? = ""

        val extras = intent.extras
        if (extras != null) {
            data = extras.getString("result")
            if (data != null) {
                editTextPhone2.text = data
            }

        }

        btCallButton2.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$data")
            startActivity(intent)
        }
    }
}