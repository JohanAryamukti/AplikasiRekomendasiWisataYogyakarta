package com.example.aplikasirekomendasiwisatayogyakarta.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

data class Place(
    val id: Int,
    val name: String,
    val category: CategoryType,
    val location: String,
    val openHours: String,
    val ticketPrice: String,
    val rating: Double,
    val tags: List<String>,
    val visitingTip: String,
    val description: String,
    val icon: ImageVector,
    @DrawableRes val imageRes: Int
)