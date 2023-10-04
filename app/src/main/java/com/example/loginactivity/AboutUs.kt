package com.example.loginactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        //instance
        val imgCall: ImageView = findViewById(R.id.imageViewCalll)
        val web: ImageView = findViewById(R.id.imageViewWeb)
        val location: ImageView = findViewById(R.id.imageViewLocation)
        //event saat image call di-klik
        imgCall.setOnClickListener {
            val callIntent: Intent = Uri.parse("tel:082210026366").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }
        //website
        web.setOnClickListener {
            val webIntent: Intent = Uri.parse("https://auth.amikom.ac.id/").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
        }
        //lokasi
        location.setOnClickListener {
            val gmnIntentUri = Uri.parse("geo:47.6,-1223?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmnIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }
    }
}
