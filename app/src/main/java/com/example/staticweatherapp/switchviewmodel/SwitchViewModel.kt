package com.example.staticweatherapp.switchviewmodel

import androidx.lifecycle.ViewModel
import com.example.staticweatherapp.switchuistate.SwitchUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SwitchViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(SwitchUiState())
    val uiState: StateFlow<SwitchUiState> = _uiState.asStateFlow()

    fun onSwitchToggle() {
        _uiState.update {
            it.copy(
                isToggled = !it.isToggled
            )
        }
    }
}