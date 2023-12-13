package com.example.staticweatherapp.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.example.staticweatherapp.model.Item

class ItemDiffCallback : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return when {
            oldItem is Item.TodaysWeatherItem && newItem is Item.TodaysWeatherItem ->
                oldItem.id == newItem.id

            oldItem is Item.WeatherItem && newItem is Item.WeatherItem ->
                oldItem.id == newItem.id

            else -> false
        }
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return when {
            oldItem is Item.TodaysWeatherItem && newItem is Item.TodaysWeatherItem ->
                oldItem == newItem

            oldItem is Item.WeatherItem && newItem is Item.WeatherItem ->
                oldItem == newItem

            else -> false
        }
    }
}