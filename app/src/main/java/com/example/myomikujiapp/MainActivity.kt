package com.example.myomikujiapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
            //Log.v("MainActivity","Button Clicked")
            val results = arrayOf("大吉","吉","中吉","小吉","凶")

            //val n = Random().nextInt(5)
            val n = Random().nextInt(results.count())


            if (n == 0 ){
                //resultTextView.setTextColor(Color.RED)
                resultTextView.setTextColor(Color.argb(255,255,0,0))
            } else{
                resultTextView.setTextColor(Color.parseColor("#808080"))
            }

            resultTextView.text = results.get(n)


        }
    }
}