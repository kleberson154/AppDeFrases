package com.kleberson.frasesdebomdia

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun geradorDeFrases(view: View){
        val frases = listOf(
            "A vida é feita de escolhas.",
            "Acredite em você mesmo.",
            "Cada dia é uma nova oportunidade.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "A gratidão transforma o que temos em suficiente.",
            "A felicidade não é um destino, mas uma forma de viajar.",
            "A persistência é o caminho do êxito.",
            "A vida é 10% o que acontece conosco e 90% como reagimos a isso.",
            "A única maneira de fazer um excelente trabalho é amar o que você faz.",
            "A mudança é o processo pelo qual o futuro invade nossas vidas."
        )
        val fraseAleatoria = frases.random()
        val textView = findViewById<TextView>(R.id.frase)
        textView.visibility = View.VISIBLE
        textView.text = fraseAleatoria
    }
}