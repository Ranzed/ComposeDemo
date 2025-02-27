package ru.ranzed.composedemo.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PlaceCategory(
    val id: Int,
    val slug: String,
    val name: String,
)
