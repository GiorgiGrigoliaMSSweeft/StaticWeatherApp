package com.example.staticweatherapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.staticweatherapp.data.weatherForecastItems
import com.example.staticweatherapp.databinding.ItemTodaysWeatherBinding
import com.example.staticweatherapp.databinding.ItemWeatherForecastBinding
import com.example.staticweatherapp.model.Item

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {
    private val items = weatherForecastItems

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return when (viewType) {
            R.layout.item_todays_weather -> RecyclerViewHolder.TodaysWeatherViewHolder(
                ItemTodaysWeatherBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            R.layout.item_weather_forecast -> RecyclerViewHolder.WeatherViewHolder(
                ItemWeatherForecastBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            else -> throw IllegalArgumentException("Invalid ViewType")
        }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        when (holder) {
            is RecyclerViewHolder.TodaysWeatherViewHolder -> holder.bind(items[position] as Item.TodaysWeatherItem)
            is RecyclerViewHolder.WeatherViewHolder -> holder.bind(items[position] as Item.WeatherItem)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Item.TodaysWeatherItem -> R.layout.item_todays_weather
            is Item.WeatherItem -> R.layout.item_weather_forecast
        }
    }
}