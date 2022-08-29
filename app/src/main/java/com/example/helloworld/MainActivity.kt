package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Marco", "tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener{
            Log.i("Marco", "tapped on button 2")
            findViewById<ConstraintLayout>(R.id.background).setBackgroundColor(getResources().getColor(R.color.purple_200))
        }

        findViewById<Button>(R.id.button3).setOnClickListener{
            Log.i("Marco", "tapped on button 3")
            findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
        }

        findViewById<ConstraintLayout>(R.id.background).setOnClickListener{
            Log.i("Marco", "clicked background")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
            findViewById<ConstraintLayout>(R.id.background).setBackgroundColor(getResources().getColor(
                androidx.cardview.R.color.cardview_dark_background))
            findViewById<TextView>(R.id.textView).setText("Hello from Marco")
        }


    }
}