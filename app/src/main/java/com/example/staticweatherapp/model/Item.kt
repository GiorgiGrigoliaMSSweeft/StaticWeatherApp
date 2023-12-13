package com.example.staticweatherapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Item {
    data class TodaysWeatherItem(
        val id: Int,
        @DrawableRes val weatherIcon: Int,
        @StringRes val weatherText: Int,
        @StringRes val weatherDegrees: Int,
        @StringRes val feelsLikeDegrees: Int
    ) : Item()

    data class WeatherItem(
        val id: Int,
        @StringRes val date: Int,
        @DrawableRes val weatherIcon: Int,
        @StringRes val degrees: Int
    ) : Item()
}