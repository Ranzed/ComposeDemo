package ru.ranzed.composedemo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.di.AwesomeSingletoneDI

class MainViewModel : ViewModel() {

    val eventListFlow: Flow<List<EventShortModel>>
        get() = _mutableEventListFlow

    private val _mutableEventListFlow: MutableStateFlow<List<EventShortModel>> = MutableStateFlow(emptyList())

    private val repository = AwesomeSingletoneDI.component.repository

    init {
        viewModelScope.launch {
            val eventsList = repository.getEventShortModels()
            _mutableEventListFlow.emit(eventsList)
        }
    }

}