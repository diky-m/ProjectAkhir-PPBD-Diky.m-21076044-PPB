package com.example.taandroid.api

import com.example.taandroid.ResponseMateri
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
        @GET("materi")
        fun getMateri () : Call<ResponseMateri>
    }