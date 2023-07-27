package com.example.weather.data

import android.app.Application
import com.example.weather.api.AppConfig

class WeatherRepository(
    app : Application
) {
    suspend fun getWeatherInfo() = AppConfig.apiService.getWeather()
}