package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.databinding.ActivityMainBinding
import android.content.Intent


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
        binding.ButtonOpenForm.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.ButtonOpenList.setOnClickListener{
            //startActivity(Intent(this, ListActivity::class.java))
            Toast.makeText(this, getString(R.string.Upcoming), Toast.LENGTH_SHORT).show()
        }


    }
    
}