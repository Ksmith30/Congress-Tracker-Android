package com.example.kylesmith.congresstracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Retrofit
import java.util.*

class MainActivity : AppCompatActivity() {
    private var apiKey: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apiKey = getString(R.string.key)
        val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl("https://api.propublica.org/")
                .build()

        val service : ProPublicaService = retrofit.create(ProPublicaService::class.java)
        val member: Call<Meta> = service.getCongressMembers("senate", apiKey)
    }
}
