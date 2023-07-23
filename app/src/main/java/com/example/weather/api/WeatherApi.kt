package com.example.weather.api

import retrofit2.http.GET

interface WeatherApi {
    @GET("/note")
    suspend fun getWeather()
}