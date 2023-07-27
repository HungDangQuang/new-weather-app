package com.example.weather.api

import com.example.weather.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppConfig {
    private const val BASE_URL = Constants.WEATHER_URL

    private val builder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = builder.build()

    val apiService: WeatherApi? = retrofit.create(WeatherApi::class.java)
}