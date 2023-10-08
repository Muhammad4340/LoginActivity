package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.login.MainActivity


class MainActivity : AppCompatActivity() {
    lateinit var binding: MainActivity

    private fun replaceFragment(frg: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentMainActivity,frg)
        fragmentTrx.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivity.inflate(layoutInflater)
        setContentView(binding.root)

        //event saat button Kamar di click
        binding.buttonKamar.setOnClickListener{
            replaceFragment(KamarFragment)
    }
}