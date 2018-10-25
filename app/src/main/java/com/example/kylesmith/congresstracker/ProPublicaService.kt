package com.example.kylesmith.congresstracker

import com.example.kylesmith.congresstracker.R.string.key
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ProPublicaService{
    @GET("{chamber}/members.json")
    fun getCongressMembers(@Path("chamber") chamber: String,
                           @Header("X-API-Key") key: String) : Call<List<CongressMember>>

}