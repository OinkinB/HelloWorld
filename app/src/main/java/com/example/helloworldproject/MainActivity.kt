package com.example.helloworldproject

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.babyImageView)//gets image
        val button = findViewById<Button>(R.id.changeButton)//gets button
        val view = findViewById<TextView>(R.id.introTextView);

        button.setOnClickListener{
            Log.v("Hello World", "Button is working")
            Toast.makeText(this,"Its Time for work",Toast.LENGTH_SHORT).show()// creates toast under button
            image.setImageResource(R.drawable.boss_baby)//change image to boss_baby
            view.setText("This is boss baby")


        }

    }


}


