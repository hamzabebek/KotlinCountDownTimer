package com.example.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Abstract - Inheritance

        object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                textView.text = "Left : ${p0/1000}"
            }

            override fun onFinish() {
                textView.text = "Finished"
            }

        }.start()
    }
}