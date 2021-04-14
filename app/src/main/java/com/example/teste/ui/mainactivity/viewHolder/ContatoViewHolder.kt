package com.example.teste.ui.mainactivity.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.model.Contato
import kotlinx.android.synthetic.main.list_item_contato.view.*

class ContatoViewHolder(view: View) : RecyclerView.ViewHolder(view){
    fun bindView(contato: Contato) {
        itemView.nome_textViewField.text = contato.nome
        itemView.email_textViewField.text = contato.email
    }
}