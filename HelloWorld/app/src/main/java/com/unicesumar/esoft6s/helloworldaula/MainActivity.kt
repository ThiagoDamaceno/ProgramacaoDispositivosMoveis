package com.unicesumar.esoft6s.helloworldaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var helloTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById<TextView>(R.id.helloTextView)
        helloTextView!!.text = "Olá Thiago"

        helloTextView!!.setOnClickListener {
            Toast.makeText(applicationContext, "Texto do novo Toast", Toast.LENGTH_LONG).show()
        }
    }
}