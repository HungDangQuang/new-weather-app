package com.example.weather.data

data class Timelines(
    val timestep: String,
    val endTime: String,
    val startTime: String,
    val intervals: ArrayList<Intervals>
)
