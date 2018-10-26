package com.example.kylesmith.congresstracker

import android.content.Context
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RestApi {

    private val proPublicaService: ProPublicaService

    init {
        val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl("https://api.propublica.org/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        proPublicaService = retrofit.create(ProPublicaService::class.java)
    }

}
