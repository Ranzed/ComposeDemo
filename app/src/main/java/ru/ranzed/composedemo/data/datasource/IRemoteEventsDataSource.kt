package ru.ranzed.composedemo.data.datasource

import ru.ranzed.composedemo.data.model.EventCategory
import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.data.model.PlaceCategory

interface IRemoteEventsDataSource {
    suspend fun getEventShortModels(): List<EventShortModel>
    suspend fun getEventCategories(): List<EventCategory>
    suspend fun getPlaceCategories(): List<PlaceCategory>
}
