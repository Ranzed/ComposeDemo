package ru.ranzed.composedemo.data.api

import kotlinx.serialization.Serializable
import ru.ranzed.composedemo.data.model.EventShortModel

@Serializable
data class EventsResponse(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<EventShortModel>
)