package com.example.covidapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface Service {


    interface ApiService {
        @GET("summary")
        fun getAllNegara(): Call<AllNegara>
    }

    interface infoService {
        @GET()
        fun getInfoService(@Url url: String?): Call<List<InfoNegara>>
    }
}
