package com.example.scintificcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.databinding.DataBindingUtil
import com.example.scintificcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var calTxt : TextView
    lateinit var resultTxt : TextView

    lateinit var btn0 : Button
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        calTxt = binding.calTxt
        resultTxt = binding.resultTxt

        btn0 = binding.btn0
        btn1 = binding.btn1
        btn2 = binding.btn2
        btn3 = binding.btn3
        btn4 = binding.btn4
        btn5 = binding.btn5
        btn6 = binding.btn6
        btn7 = binding.btn7
        btn8 = binding.btn8
        btn9 = binding.btn9

        btn0.setOnClickListener {
            calTxt.text = "${calTxt.text} 0"
        }

    }
}