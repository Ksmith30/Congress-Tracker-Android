package com.example.kylesmith.congresstracker

import okhttp3.Interceptor
import okhttp3.Response

class ProPublicaRequestInceptor(private val apiKey: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        val url = request.url().newBuilder()
                .build()

        val newRequest = request.newBuilder()
                .url(url)
                .addHeader("X-API-KEY", apiKey)
                .build()

        return chain.proceed(newRequest)
    }
}