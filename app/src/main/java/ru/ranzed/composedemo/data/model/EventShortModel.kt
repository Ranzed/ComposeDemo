package ru.ranzed.composedemo.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EventShortModel(
    val id: Int,
    val title: String,
    val slug: String
)
