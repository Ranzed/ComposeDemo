package ru.ranzed.composedemo.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EventCategory(
    val id: Int,
    val slug: String,
    val name: String,
)
