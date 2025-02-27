package ru.ranzed.composedemo.data.api

import retrofit2.http.GET
import ru.ranzed.composedemo.data.model.PlaceCategory


interface IKudaGoApi {

    @GET("/public-api/v1.4/events/")
    suspend fun getEventShortModels(): EventsResponse

    @GET("/public-api/v1.4/event-categories/")
    suspend fun getEventCategories(): List<PlaceCategory>
}