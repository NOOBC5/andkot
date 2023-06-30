package com.example.mycount

import android.os.Bundle
import android.os.SystemClock
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycount.databinding.ActivityMainBinding
import com.example.mycount.ui.theme.AndkotTheme

class MainActivity : ComponentActivity() {
    var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countButton.setOnClickListener{
            count++
            binding.countText.text = "$count"
        }

        binding.resetButton.setOnClickListener {
            count = 0
            binding.countText.text = "$count"
        }
    }
}