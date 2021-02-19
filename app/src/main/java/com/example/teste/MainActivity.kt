package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  
        var num = 1
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun sendToast(num: String){
            val myToast = Toast.makeText(applicationContext, "Clicked $num times", Toast.LENGTH_SHORT)
            myToast.show()
        }

        fun changeText(){
            when (num){
                10 -> sendToast(num.toString())
                15 -> sendToast(num.toString())
            }

            binding.textView.text = getString(R.string.NewText, num.toString())
            num++
        }


        binding.changeBtn.setOnClickListener{
            changeText()
        }
        binding.resetBtn.setOnClickListener {
            num = 0
            changeText()
        }

    }
    
}