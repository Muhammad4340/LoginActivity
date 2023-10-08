package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.login.dashboard

class dashboard : AppCompatActivity() {
    lateinit var binding:dashboard

private fun replaceFragment(frg:Fragment) {
    val fragmentManager = supportFragmentManager
    val fragmentTrx = fragmentManager.beginTransaction()
    fragmentTrx.replace(R.id.buttonKamar, frg)
    fragmentTrx.commit()
}

    //event saat button kamar di click
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding.buttonKamar.setOnClickListener {
        replaceFragment(fra)
    }
}