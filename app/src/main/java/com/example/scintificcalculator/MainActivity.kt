package com.example.scintificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import androidx.databinding.DataBindingUtil
import com.example.scintificcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var calTxt : TextView
    lateinit var resultTxt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        calTxt = binding.calTxt
        resultTxt = binding.resultTxt


    }
}