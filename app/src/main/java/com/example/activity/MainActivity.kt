package com.example.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val SECOND_ACTIVITY_DATA = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btPhoneButton1 = findViewById<ImageButton>(R.id.btPhoneButton1)

        btPhoneButton1.setOnClickListener {
            startActivityForResult(Intent(this, MainActivity2::class.java), SECOND_ACTIVITY_DATA)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            SECOND_ACTIVITY_DATA -> {
                if (resultCode == Activity.RESULT_OK) {
                    Log.d("y1", "${data?.getStringExtra("result")}")
                }
            }
        }
    }
}