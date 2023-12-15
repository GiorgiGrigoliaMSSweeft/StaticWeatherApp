package com.example.staticweatherapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.staticweatherapp.RecyclerViewAdapter
import com.example.staticweatherapp.data.weatherForecastItems
import com.example.staticweatherapp.databinding.FragmentWeatherForecastBinding

class WeatherForecastFragment : Fragment() {
    private val binding by lazy { FragmentWeatherForecastBinding.inflate(layoutInflater) }
    private val recyclerViewAdapter by lazy { RecyclerViewAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.weatherRecyclerView.apply {
            adapter = recyclerViewAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        recyclerViewAdapter.submitList(weatherForecastItems)
    }
}