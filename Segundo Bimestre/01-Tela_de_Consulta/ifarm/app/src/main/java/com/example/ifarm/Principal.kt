package com.example.ifarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val textoEmail = findViewById<EditText>(R.id.email)

        val botaoConsultar = findViewById<Button>(R.id.consulta)

        botaoConsultar.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Email " + textoEmail.text,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}