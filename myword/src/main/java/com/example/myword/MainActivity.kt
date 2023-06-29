package com.example.myword

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getWord()
    }

    private fun getWord(): String {
        val list = listOf(
            "ENFJ",
            "ENTJ",
            "ESFJ",
            "ESTJ",
            "ENFP",
            "ENTP",
            "ESFP",
            "ESTP",
            "INFJ",
            "INTJ",
            "ISFJ",
            "ISTJ",
            "INTJ",
            "INFJ",
            "ISFP",
            "ISTP",
        )
        return list.random()
    }
}
