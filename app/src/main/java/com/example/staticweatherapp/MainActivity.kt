package com.example.staticweatherapp

import android.os.Bundle
import android.view.Menu
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.staticweatherapp.databinding.ActivityMainBinding
import com.example.staticweatherapp.fragments.SwitchButtonFragment
import com.example.staticweatherapp.fragments.WeatherForecastFragment
import com.example.staticweatherapp.switchviewmodel.SwitchViewModel

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel: SwitchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SwitchButtonFragment>(R.id.switchFragmentContainer)
                add<WeatherForecastFragment>(R.id.weatherForecastFragmentContainer)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_button, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        super.onPrepareOptionsMenu(menu)
        menu.findItem(R.id.accessibility_icon).isVisible = !viewModel.uiState.value.isToggled
        return true
    }
}