package com.example.teste.ui.mainactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teste.R
import com.example.teste.model.Contato
import com.example.teste.ui.mainactivity.adapter.ContatoAdapter
import com.example.teste.ui.mainactivity.viewModel.ContatoViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val viewModel: ContatoViewModel = ContatoViewModel()
    private var listContato = listOf<Contato>()
    init {
        listContato = listOf<Contato>(
                Contato(1, "luiz", "11", "11"),
                Contato(1, "maria", "11", "11"),
                Contato(1, "jao", "11", "11"),
                Contato(1, "carluxo", "11", "11")
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        viewModel.contato.observeForever { data ->
            Log.i("API", "Dados recebidos")
            contato_recyclerview.apply {
                layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
                adapter = ContatoAdapter(this.context, data.conteudoResposta)
            }
        }
        contato_recyclerview.apply {
            layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = ContatoAdapter(this.context, listContato)
        }
    }

}