package com.senai.jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val novoJogo = findViewById<Button>(R.id.novoJogo)

        novoJogo.setOnClickListener() {
            val intent = Intent(this, PlayerVSpc::class.java)
            startActivity(intent)
        }

        val alertButton = findViewById<Button>(R.id.sair)
        alertButton.setOnClickListener{mensagemAlert()}
    }

    private fun mensagemAlert() {
        AlertDialog.Builder(this).setTitle("Atenção!!").setMessage("Deseja sair do APP?").setPositiveButton("Sim") {_,_-> finish()}
            .setNegativeButton("Cancelar") {_,_->}.show()
    }
}