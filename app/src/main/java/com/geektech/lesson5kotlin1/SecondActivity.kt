package com.geektech.lesson5kotlin1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geektech.lesson5kotlin1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arguments = intent.extras
        val name = arguments?.get("key1").toString()
        binding.tvLog.text = name
    }
}