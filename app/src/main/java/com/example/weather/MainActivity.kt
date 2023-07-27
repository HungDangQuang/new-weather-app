package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.weather.api.AppConfig
import com.example.weather.api.WeatherApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val weatherApi = AppConfig.getInstance().create(WeatherApi::class.java)
//        runBlocking {
//            launch {
//                val weatherRes = weatherApi.getWeather()
//                if (weatherRes != null) {
//                    Log.d("weather", "onCreate: " + weatherRes.raw().request().url())
//                    Log.d("weather", "onCreate: " + weatherRes.body())
//                }
//            }
//        }
    }
}