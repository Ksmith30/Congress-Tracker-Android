package com.example.kylesmith.congresstracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Retrofit
import java.util.*

class MainActivity : AppCompatActivity() {
    val apiKey : String = resources.getString(R.string.key)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl("https://api.propublica.org/congress/v1/115/")
                .build()

        val service : ProPublicaService = retrofit.create(ProPublicaService::class.java)
        val member: Call<List<CongressMember>> = service.getCongressMembers("senate", apiKey)
    }
}
