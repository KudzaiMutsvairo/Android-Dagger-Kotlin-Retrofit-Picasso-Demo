package com.kudzai.mutswairo.daggerkotlinpractice1.di

import com.kudzai.mutswairo.daggerkotlinpractice1.data.RetrofitService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitModule {
    private val baseUrl = "https://api.github.com/search/"

    @Provides
    @Singleton
    fun getRetrofitServiceInstance(retrofit: Retrofit) : RetrofitService {
        return retrofit.create(RetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}