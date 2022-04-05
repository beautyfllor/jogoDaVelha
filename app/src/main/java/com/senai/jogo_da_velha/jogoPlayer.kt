package com.senai.jogo_da_velha

import android.content.Intent
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class jogoPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_player)

        val jogador1 = findViewById<TextView>(R.id.jogador1)
        val jogador2 = findViewById<TextView>(R.id.jogador2)

        val jogadorAtual = 1

        val box1 = findViewById<Button>(R.id.box1)
        val box2 = findViewById<Button>(R.id.box2)
        val box3 = findViewById<Button>(R.id.box3)
        val box4 = findViewById<Button>(R.id.box4)
        val box5 = findViewById<Button>(R.id.box5)
        val box6 = findViewById<Button>(R.id.box6)
        val box7 = findViewById<Button>(R.id.box7)
        val box8 = findViewById<Button>(R.id.box8)
        val box9 = findViewById<Button>(R.id.box9)

        box1.setOnClickListener() {
            if (jogadorAtual == 1) {
                box1.text = "X"
            }
        jogador1.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
        jogador2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }

        box2.setOnClickListener() {
            if(jogadorAtual == 1) {
                box2.text = "X"
            }
            jogador1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            jogador2.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
        }
    }
}