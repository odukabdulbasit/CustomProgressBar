package com.odukabdulbasit.customprogressbar

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.swiperefreshlayout.widget.CircularProgressDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circularProgressDrawable = CircularProgressDrawable(this)
        circularProgressDrawable.strokeWidth = 10f
        circularProgressDrawable.centerRadius = 50f
        circularProgressDrawable.setColorSchemeColors(ContextCompat.getColor(this, com.google.android.material.R.color.accent_material_light))
        circularProgressDrawable.start()

        val imageView = findViewById<ImageView>(R.id.progressImageView)
        imageView.setImageDrawable(circularProgressDrawable)
    }
}
