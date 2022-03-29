package com.senai.jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButtonToggleGroup

class niveisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveis)

        val facil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)

        facil.setOnClickListener() {
            val intent = Intent(this, jogoFacil::class.java)
            startActivity(intent)
        }

        medio.setOnClickListener() {
            val intent = Intent(this, jogoMedio::class.java)
            startActivity(intent)
        }

        dificil.setOnClickListener() {
            val intent = Intent(this, jogoDificil::class.java)
            startActivity(intent)
        }
    }
}