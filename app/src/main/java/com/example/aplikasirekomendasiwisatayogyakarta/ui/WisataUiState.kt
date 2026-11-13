package com.example.aplikasirekomendasiwisatayogyakarta.ui

import com.example.aplikasirekomendasiwisatayogyakarta.data.LocalPlacesDataProvider
import com.example.aplikasirekomendasiwisatayogyakarta.model.CategoryType
import com.example.aplikasirekomendasiwisatayogyakarta.model.Place

enum class ScreenLevel {
    CATEGORIES,
    PLACES_LIST,
    PLACE_DETAIL
}

data class WisataUiState(
    val currentCategory: CategoryType = CategoryType.ALAM,
    val currentPlace: Place = LocalPlacesDataProvider.defaultPlace,
    val currentScreen: ScreenLevel = ScreenLevel.CATEGORIES,
    val searchQuery: String = "",
    val favoriteIds: Set<Int> = emptySet(),
    val showFavoritesOnly: Boolean = false
) {
    val placesInCurrentCategory: List<Place>
        get() = LocalPlacesDataProvider.getPlacesByCategory(currentCategory)

    val filteredGlobalPlaces: List<Place>
        get() = LocalPlacesDataProvider.allPlaces.filter { place ->
            val matchesQuery = searchQuery.isBlank() ||
                    place.name.contains(searchQuery, ignoreCase = true) ||
                    place.location.contains(searchQuery, ignoreCase = true) ||
                    place.tags.any { it.contains(searchQuery, ignoreCase = true) }
            val matchesFav = !showFavoritesOnly || place.id in favoriteIds
            matchesQuery && matchesFav
        }
}