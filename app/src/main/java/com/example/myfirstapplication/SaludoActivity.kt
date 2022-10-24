package com.example.myfirstapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        txtSaludo = findViewById(R.id.txtSaludo)
        val saludo = intent.getStringExtra("NOMBRE")
        txtSaludo.text = "Hola $saludo, bienvenido ^^"
    }
}