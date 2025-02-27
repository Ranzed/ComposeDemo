package ru.ranzed.composedemo.data.repository

import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.data.model.PlaceCategory

interface IEventsRepository {

    suspend fun getEventShortModels(): List<EventShortModel>

    suspend fun getEventCategories(): List<PlaceCategory>
}