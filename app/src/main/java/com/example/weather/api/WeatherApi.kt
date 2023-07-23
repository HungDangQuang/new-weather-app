package com.example.weather.api

import com.example.weather.data.WeatherResults
import com.example.weather.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("/v4/timelines")
    suspend fun getWeather(
        @Query("location") location: String = "40.75872069597532,-73.98529171943665",
        @Query("fields") fields: String = "temperature",
        @Query("timesteps") timeSteps: String = Constants.API_PARAM_TIMESTEPS,
        @Query("unit") unit: String = Constants.API_PARAM_METRIC,
        @Query("apikey") apiKey: String = Constants.API_KEY
    ) : Response<WeatherResults>
}