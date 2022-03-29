package com.senai.jogo_da_velha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class jogoFacil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_facil)

        val box1 = findViewById<Button>(R.id.box1)
        val box2 = findViewById<Button>(R.id.box2)
        val box3 = findViewById<Button>(R.id.box3)
        val box4 = findViewById<Button>(R.id.box4)
        val box5 = findViewById<Button>(R.id.box5)
        val box6 = findViewById<Button>(R.id.box6)
        val box7 = findViewById<Button>(R.id.box7)
        val box8 = findViewById<Button>(R.id.box8)
        val box9 = findViewById<Button>(R.id.box9)
    }
}