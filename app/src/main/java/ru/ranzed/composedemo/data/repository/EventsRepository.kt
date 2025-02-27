package ru.ranzed.composedemo.data.repository

import ru.ranzed.composedemo.data.datasource.RemoteEventsDataSource
import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.data.model.PlaceCategory

class EventsRepository(
    private val remoteEventsDataSource: RemoteEventsDataSource
) : IEventsRepository {

    override suspend fun getEventShortModels(): List<EventShortModel> {
        return remoteEventsDataSource.getEventShortModels()
    }

    override suspend fun getEventCategories(): List<PlaceCategory> {
        return remoteEventsDataSource.getEventCategories()
    }
}