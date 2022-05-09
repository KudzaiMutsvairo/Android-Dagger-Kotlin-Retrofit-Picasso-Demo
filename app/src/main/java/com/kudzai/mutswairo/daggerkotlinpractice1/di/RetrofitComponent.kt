package com.kudzai.mutswairo.daggerkotlinpractice1.di

import com.kudzai.mutswairo.daggerkotlinpractice1.ui.MainActivityViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitModule::class])
interface RetrofitComponent {
    fun inject(mainActivityViewModel : MainActivityViewModel)
}