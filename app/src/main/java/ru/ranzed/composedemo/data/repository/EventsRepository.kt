package ru.ranzed.composedemo.data.repository

import ru.ranzed.composedemo.data.datasource.RemoteEventsDataSource
import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.data.model.EventCategory
import ru.ranzed.composedemo.data.model.PlaceCategory

class EventsRepository(
    private val remoteDataSource: RemoteEventsDataSource
) : IEventsRepository {

    override suspend fun getEventShortModels(): List<EventShortModel> {
        return remoteDataSource.getEventShortModels()
    }

    override suspend fun getEventCategories(): List<EventCategory> {
        return remoteDataSource.getEventCategories()
    }

    override suspend fun getPlaceCategories(): List<PlaceCategory> {
        return remoteDataSource.getPlaceCategories()
    }
}