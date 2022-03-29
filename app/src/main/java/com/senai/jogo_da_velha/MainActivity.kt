package com.senai.jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val novoJogo = findViewById<Button>(R.id.novoJogo)
        val sair = findViewById<Button>(R.id.sair)

        novoJogo.setOnClickListener() {
            val intent = Intent(this, PlayerVSpc::class.java)
            startActivity(intent)
        }

        sair.setOnClickListener() {
            finish()
        }
    }
}