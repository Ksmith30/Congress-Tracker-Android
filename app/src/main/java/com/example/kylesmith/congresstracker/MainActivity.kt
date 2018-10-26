package com.example.kylesmith.congresstracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.*

class MainActivity : AppCompatActivity() {
    private var apiKey: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apiKey = getString(R.string.key)
        val restApi = RestApi()
    }
}
