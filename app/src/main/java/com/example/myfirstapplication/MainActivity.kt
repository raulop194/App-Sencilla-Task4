package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var txtName: EditText
    private lateinit var btnAceptar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            intent.putExtra("NOMBRE", txtName.text.toString())
            startActivity(intent)
        }

    }

}