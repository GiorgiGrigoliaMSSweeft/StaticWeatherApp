package com.example.staticweatherapp

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.staticweatherapp.databinding.ItemTodaysWeatherBinding
import com.example.staticweatherapp.databinding.ItemWeatherForecastBinding
import com.example.staticweatherapp.model.Item

sealed class RecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class TodaysWeatherViewHolder(private val binding: ItemTodaysWeatherBinding) : RecyclerViewHolder(binding) {
        fun bind(item: Item.TodaysWeatherItem) {
            binding.todaysWeatherIcon.setImageResource(item.weatherIcon)
            binding.weatherText.setText(item.weatherText)
            binding.weatherDegrees.setText(item.weatherDegrees)
            binding.feelsLikeDegrees.setText(item.feelsLikeDegrees)
        }
    }

    class WeatherViewHolder(private val binding: ItemWeatherForecastBinding) : RecyclerViewHolder(binding) {
        fun bind(item: Item.WeatherItem) {
            binding.date.setText(item.date)
            binding.weatherIcon.setImageResource(item.weatherIcon)
            binding.degrees.setText(item.degrees)
        }
    }
}