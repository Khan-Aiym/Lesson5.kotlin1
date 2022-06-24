package com.geektech.lesson5kotlin1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geektech.lesson5kotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var binding: ActivityMainBinding
    private var check: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPlus.setOnClickListener {
            logicCount()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun logicCount() {
        if (count in 0..9 && !check) {
            count++
            binding.text.text = count.toString()
            if (count == 10) {
                check = true
            }
        } else if (count in 10 downTo 1) {
            count--
            binding.text.text = count.toString()
        } else {
            binding.text.text = "text"
            val element = binding.text.text
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("key1", element)
            startActivity(intent)
        }
    }
}