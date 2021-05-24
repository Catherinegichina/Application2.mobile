package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input1=findViewById<TextView>(R.id.tvresult1)
        var input2=findViewById<TextView>(R.id.tvresult2)
        var input3=findViewById<TextView>(R.id.tvresult3)
        var button1=findViewById<Button>(R.id.btnADD)
        var button2=findViewById<Button>(R.id.btnSUBTRACT)
        var button3=findViewById<Button>(R.id.btnMODULUS)
        var button4=findViewById<Button>(R.id.btnMULTIPLY)

        button1.setOnClickListener{
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var addition=result1+result2
            input3.text="Answer:$addition"
        }
        button2.setOnClickListener {
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var subtraction=result1-result2
            input3.text="Answer:$subtraction"
        }
        button3.setOnClickListener {
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var modules=result1%result2
            input3.text="Answer:$modules"
        }
        button4.setOnClickListener {
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var multiply=result1*result2
            input3.text="Answer:$multiply"
        }
    }
}