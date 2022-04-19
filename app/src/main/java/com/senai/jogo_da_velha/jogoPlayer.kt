package com.senai.jogo_da_velha

import android.content.Intent
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class jogoPlayer : AppCompatActivity() {

    var jogador = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_player)

        val box1 = findViewById<Button>(R.id.box1)
        val box2 = findViewById<Button>(R.id.box2)
        val box3 = findViewById<Button>(R.id.box3)
        val box4 = findViewById<Button>(R.id.box4)
        val box5 = findViewById<Button>(R.id.box5)
        val box6 = findViewById<Button>(R.id.box6)
        val box7 = findViewById<Button>(R.id.box7)
        val box8 = findViewById<Button>(R.id.box8)
        val box9 = findViewById<Button>(R.id.box9)


        box1.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box2.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box3.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box4.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box5.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box6.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box7.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box8.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }

        box9.setOnClickListener { it as Button
            jogar(it)
            proximoJogador()
            color()
        }


//        box5.setOnClickListener() {
//            if(jogadorAtual == 1) {
//                box5.text = "X"
//            }
//            jogador1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
//            jogador2.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
//        }
//
//        if(box9.isPressed) {
//            jogadorAtual = 2;
//            if(jogadorAtual == 2) {
//                box2.text = "O"
//                jogador1.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
//                jogador2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
//            }
//        }

        //val jogadas = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    }

    private fun jogar(it: Button) {
        it.text = jogador
        it.isEnabled = false
    }

    private fun proximoJogador() {
        if (jogador == "X") {
            jogador = "O"
        }else{
            jogador = "X"
        }
    }

    //Tem que arrumar essas cores
    private fun color() {
        val jogador1 = findViewById<TextView>(R.id.jogador1)
        val jogador2 = findViewById<TextView>(R.id.jogador2)

        jogador1.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
        jogador2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
    }
}