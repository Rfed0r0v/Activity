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
        val edPhoneNumber1 = findViewById<EditText>(R.id.editTextPhone)


       /* edPhoneNumber1.addTextChangedListener(object : TextWatcher {
            private var mSelfChange = false

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s == null || mSelfChange) {
                    return
                }

                val preparedStr = s.replace(Regex("(\\D*)"), "")
                var resultStr = ""
                for (i in preparedStr.indices) {
                    resultStr = when (i) {
                        0 -> resultStr.plus("+7 (")
                        1 -> resultStr.plus(preparedStr[i])
                        2 -> resultStr.plus(preparedStr[i])
                        3 -> resultStr.plus(preparedStr[i])
                        4 -> resultStr.plus(") ".plus(preparedStr[i]))
                        5 -> resultStr.plus(preparedStr[i])
                        6 -> resultStr.plus(preparedStr[i])
                        7 -> resultStr.plus("-".plus(preparedStr[i]))
                        8 -> resultStr.plus(preparedStr[i])
                        9 -> resultStr.plus("-".plus(preparedStr[i]))
                        10 -> resultStr.plus(preparedStr[i])
                        else -> resultStr
                    }
                }

                mSelfChange = true
                val oldSelectionPos = edPhoneNumber1.selectionStart
                val isEdit = edPhoneNumber1.selectionStart != edPhoneNumber1.length()
                edPhoneNumber1.setText(resultStr)
                if (isEdit) {
                    edPhoneNumber1.setSelection(if (oldSelectionPos > resultStr.length) resultStr.length else oldSelectionPos)
                } else {
                    edPhoneNumber1.setSelection(resultStr.length)
                }
                mSelfChange = false
            }

            override fun afterTextChanged(s: Editable?) {}
        })*/

        btPhoneButton1.setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java).putExtra(
                    "result",
                    edPhoneNumber1.text.toString()
                )
            )
        }
    }
}