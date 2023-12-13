package com.example.staticweatherapp.data

import com.example.staticweatherapp.R
import com.example.staticweatherapp.model.Item

val weatherForecastItems = listOf(
    Item.TodaysWeatherItem(
        id = 1,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        weatherText = R.string.todays_weather_text,
        weatherDegrees = R.string.todays_weather_degrees,
        feelsLikeDegrees = R.string.todays_feels_like_degrees
    ),

    Item.WeatherItem(
        id = 2,
        date = R.string.weather_item_1_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_1_degrees
    ),

    Item.WeatherItem(
        id = 3,
        date = R.string.weather_item_2_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_2_degrees
    ),

    Item.WeatherItem(
        id = 4,
        date = R.string.weather_item_3_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_3_degrees
    ),

    Item.WeatherItem(
        id = 5,
        date = R.string.weather_item_4_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_4_degrees
    ),

    Item.WeatherItem(
        id = 6,
        date = R.string.weather_item_5_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_5_degrees
    ),

    Item.WeatherItem(
        id = 7,
        date = R.string.weather_item_6_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_6_degrees
    ),

    Item.WeatherItem(
        id = 8,
        date = R.string.weather_item_7_date,
        weatherIcon = R.drawable.baseline_wb_sunny_24,
        degrees = R.string.weather_item_7_degrees
    )
)