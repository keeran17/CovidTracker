package com.example.covidtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.covidtracker.databinding.ActivityCountyListBinding

class CountyListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCountyListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_county_list)
        setContentView(binding.root)
    }
}