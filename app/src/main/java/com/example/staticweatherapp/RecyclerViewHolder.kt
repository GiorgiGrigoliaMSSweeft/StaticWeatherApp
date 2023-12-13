package com.example.staticweatherapp

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.staticweatherapp.databinding.ItemTodaysWeatherBinding
import com.example.staticweatherapp.databinding.ItemWeatherForecastBinding
import com.example.staticweatherapp.model.Item

sealed class RecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class TodaysWeatherViewHolder(private val binding: ItemTodaysWeatherBinding) : RecyclerViewHolder(binding) {
        fun bind(item: Item.TodaysWeatherItem) {
            binding.apply {
                todaysWeatherIcon.setImageResource(item.weatherIcon)
                weatherText.setText(item.weatherText)
                weatherDegrees.setText(item.weatherDegrees)
                feelsLikeDegrees.setText(item.feelsLikeDegrees)
            }
        }
    }

    class WeatherViewHolder(private val binding: ItemWeatherForecastBinding) : RecyclerViewHolder(binding) {
        fun bind(item: Item.WeatherItem) {
            binding.apply {
                date.setText(item.date)
                weatherIcon.setImageResource(item.weatherIcon)
                degrees.setText(item.degrees)
            }
        }
    }
}