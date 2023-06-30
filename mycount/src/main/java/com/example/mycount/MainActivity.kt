package com.example.mycount

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mycount.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    var count = 0
    var initTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countButton.setOnClickListener{
            if (checkTime()) {
                count++
                binding.countText.text = "$count"
                binding.textView.text = "${System.currentTimeMillis() - initTime}"
            }
        }

        binding.resetButton.setOnClickListener {
            count = 0
            binding.countText.text = "$count"
        }
    }

    private fun checkTime(): Boolean {
        if (count == 0) {
            initTime = System.currentTimeMillis()
        }
        var timeDiff = System.currentTimeMillis() - initTime
        return timeDiff < 5 * 1000
    }
}