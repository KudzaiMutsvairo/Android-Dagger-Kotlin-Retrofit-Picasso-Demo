package com.kudzai.mutswairo.daggerkotlinpractice1.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.kudzai.mutswairo.daggerkotlinpractice1.DpApplication
import com.kudzai.mutswairo.daggerkotlinpractice1.data.RetrofitService
import com.kudzai.mutswairo.daggerkotlinpractice1.model.Response
import retrofit2.Call
import retrofit2.Callback
import javax.inject.Inject

class MainActivityViewModel(application : Application) : AndroidViewModel(application) {
    @Inject
    lateinit var rService : RetrofitService

    private lateinit var liveDataList : MutableLiveData<Response>

    init {
        (application as DpApplication).getRetrofitComponent().inject(this)
        liveDataList = MutableLiveData()
    }

    fun getLiveDataObservable() : MutableLiveData<Response>{
        return liveDataList
    }

    fun makeApicall(){
        val call : Call<Response>? = rService.getDataFromApi("atl")
        call?.enqueue(object : Callback<Response>{
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.isSuccessful){
                    liveDataList.postValue(response.body())
                }else{
                    liveDataList.postValue(null)
                }
            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                liveDataList.postValue(null)
            }
        }
        )
    }
}