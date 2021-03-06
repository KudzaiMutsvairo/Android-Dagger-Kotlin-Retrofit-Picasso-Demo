package com.kudzai.mutswairo.daggerkotlinpractice1.data

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import com.kudzai.mutswairo.daggerkotlinpractice1.model.Response

interface RetrofitService {
    @GET("repositories")
    suspend fun getDataFromApi(@Query("q") query : String) : Response?
}