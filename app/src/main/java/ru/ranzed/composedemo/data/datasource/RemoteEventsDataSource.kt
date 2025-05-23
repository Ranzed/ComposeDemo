package ru.ranzed.composedemo.data.datasource

import retrofit2.Retrofit
import ru.ranzed.composedemo.data.api.IKudaGoApi
import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.data.model.PlaceCategory
import ru.ranzed.composedemo.data.model.EventCategory

class RemoteEventsDataSource(
    private val retrofit: Retrofit,
) : IRemoteEventsDataSource {

    private val api: IKudaGoApi =
        retrofit.create(IKudaGoApi::class.java)

    override suspend fun getEventShortModels(): List<EventShortModel> {
        return api.getEventShortModels().results
    }

    override suspend fun getEventCategories(): List<EventCategory> {
        return api.getEventCategories()
    }

    override suspend fun getPlaceCategories(): List<PlaceCategory> {
        return api.getPlaceCategories()
    }
}