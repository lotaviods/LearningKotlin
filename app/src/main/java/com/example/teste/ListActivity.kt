package com.example.teste

import android.app.Activity
import android.os.Bundle
import com.example.teste.databinding.ActivityListBinding


class ListActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent;
        val contato = intent.getStringExtra("contato").toString()
        binding.textView2.text = contato
    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}