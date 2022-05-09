package com.kudzai.mutswairo.daggerkotlinpractice1

import android.app.Application
import com.kudzai.mutswairo.daggerkotlinpractice1.di.DaggerRetrofitComponent
import com.kudzai.mutswairo.daggerkotlinpractice1.di.RetrofitComponent
import com.kudzai.mutswairo.daggerkotlinpractice1.di.RetrofitModule

class DpApplication : Application() {
    private lateinit var retrofitComponent : RetrofitComponent
    override fun onCreate() {
        super.onCreate()

        retrofitComponent = DaggerRetrofitComponent.builder()
            .retrofitModule(RetrofitModule())
            .build()
    }

    fun getRetrofitComponent() : RetrofitComponent {
        return retrofitComponent
    }
}