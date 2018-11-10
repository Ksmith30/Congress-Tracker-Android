package com.example.kylesmith.congresstracker

import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ProPublicaApiService {
    @GET("congress/v1/115/{chamber}/members.json")
    fun getCongressMembers(@Path("chamber") chamber: String) : Observable<Meta>

    companion object Factory {
        fun create(apiKey: String): ProPublicaApiService {
            val client = OkHttpClient().newBuilder()
                    .addInterceptor(ProPublicaRequestInceptor(apiKey))
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
                    })
                    .build()

            val retrofit = Retrofit.Builder()
                    .client(client)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .baseUrl("https://api.github.com/")
                    .build()

            return retrofit.create(ProPublicaApiService::class.java)
        }
    }
}