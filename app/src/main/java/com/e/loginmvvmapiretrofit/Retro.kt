package com.e.loginmvvmapiretrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {

    fun getRetroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://atozgoauth.atozpay.id/api/v5/session/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

}