package com.example.profilebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfCountries = listOf<String>("+234", "+256","+235", "+233","+314")
        findViewById<Spinner>(R.id.picker).adapter= ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,
            listOfCountries)


    }
}