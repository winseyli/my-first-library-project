package com.example.android.myfirstlibraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.myfirstlibraryproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            largeHelloWorldText.setBold("Large Text")
            regularHelloWorldText.setNormal("Regular Text")
        }
    }
}