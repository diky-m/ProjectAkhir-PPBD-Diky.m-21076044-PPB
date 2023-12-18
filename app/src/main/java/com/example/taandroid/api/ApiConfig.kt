package com.example.taandroid.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiConfig {
    const val baseURL = "http://172.20.10.3/api/public/api/"
    fun getRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService() : ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
//    fun getService() : ApiService{
//        return getRetrofit().create(ApiService::class.java)
   // }
}