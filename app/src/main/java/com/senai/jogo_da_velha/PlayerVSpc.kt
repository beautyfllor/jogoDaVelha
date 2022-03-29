package com.senai.jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerVSpc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_vspc)

        val computador = findViewById<Button>(R.id.computador)
        val jogador = findViewById<Button>(R.id.jogador)

        computador.setOnClickListener() {
            val intent = Intent(this, niveisActivity::class.java)
            startActivity(intent)
        }

        jogador.setOnClickListener() {
            val intent = Intent(this, jogoPlayer::class.java)
            startActivity(intent)
        }
    }
}