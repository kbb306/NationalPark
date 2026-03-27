package com.example.nationalpark

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ParkListViewModel : ViewModel() {
    private val repository : ParkRepository = ParkRepository.get()
    private val _parks: MutableStateFlow<List<Park>> = MutableStateFlow(emptyList())
    val parks : StateFlow<List<Park>>
        get() {
            return _parks
        }
    init {
        viewModelScope.launch {
            repository.getParks().collect {
                _parks.value = it
            }
        }
    }
}