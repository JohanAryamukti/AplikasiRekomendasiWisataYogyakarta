package com.example.aplikasirekomendasiwisatayogyakarta.ui

import androidx.lifecycle.ViewModel
import com.example.aplikasirekomendasiwisatayogyakarta.data.LocalPlacesDataProvider
import com.example.aplikasirekomendasiwisatayogyakarta.model.CategoryType
import com.example.aplikasirekomendasiwisatayogyakarta.model.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class WisataViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(WisataUiState())
    val uiState: StateFlow<WisataUiState> = _uiState.asStateFlow()

    fun selectCategory(category: CategoryType) {
        val places = LocalPlacesDataProvider.getPlacesByCategory(category)
        _uiState.update {
            it.copy(
                currentCategory = category,
                currentPlace = places.first(),
                currentScreen = ScreenLevel.PLACES_LIST
            )
        }
    }

    fun selectPlace(place: Place) {
        _uiState.update {
            it.copy(
                currentCategory = place.category,
                currentPlace = place,
                currentScreen = ScreenLevel.PLACE_DETAIL
            )
        }
    }

    fun updateSearchQuery(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
    }

    fun toggleShowFavoritesOnly() {
        _uiState.update { it.copy(showFavoritesOnly = !it.showFavoritesOnly) }
    }

    fun toggleFavorite(placeId: Int): Boolean {
        var isNowFavorite = false
        _uiState.update { state ->
            val updated = if (placeId in state.favoriteIds) {
                isNowFavorite = false
                state.favoriteIds - placeId
            } else {
                isNowFavorite = true
                state.favoriteIds + placeId
            }
            state.copy(favoriteIds = updated)
        }
        return isNowFavorite
    }

    fun navigateBack() {
        _uiState.update { currentState ->
            val previousScreen = when (currentState.currentScreen) {
                ScreenLevel.PLACE_DETAIL -> ScreenLevel.PLACES_LIST
                ScreenLevel.PLACES_LIST -> ScreenLevel.CATEGORIES
                ScreenLevel.CATEGORIES -> ScreenLevel.CATEGORIES
            }
            currentState.copy(currentScreen = previousScreen)
        }
    }
}