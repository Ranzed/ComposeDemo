package ru.ranzed.composedemo.data.datasource

import retrofit2.Retrofit
import ru.ranzed.composedemo.data.api.IKudaGoApi
import ru.ranzed.composedemo.data.model.EventShortModel
import ru.ranzed.composedemo.data.model.PlaceCategory

class RemoteEventsDataSource(
    private val retrofit: Retrofit,
) {

    private val api: IKudaGoApi =
        retrofit.create(IKudaGoApi::class.java)

    suspend fun getEventShortModels(): List<EventShortModel> {
        return api.getEventShortModels().results
    }

    suspend fun getEventCategories(): List<PlaceCategory> {
       return api.getEventCategories()
    }
}