package com.example.extracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.extracker.databinding.ActivityAddItemBinding
import com.example.extracker.databinding.ActivityMainBinding

class AddItem : AppCompatActivity() {

    private lateinit var binding: ActivityAddItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}