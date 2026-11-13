package com.example.aplikasirekomendasiwisatayogyakarta.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Forest
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

enum class CategoryType(
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val startColor: Color,
    val endColor: Color
) {
    ALAM(
        title = "Destinasi Alam",
        subtitle = "Hutan pinus, tebing, & panorama alam Yogyakarta",
        icon = Icons.Default.Forest,
        startColor = Color(0xFF1B5E20),
        endColor = Color(0xFF43A047)
    ),
    COFFEE_SHOP(
        title = "Coffee Shop",
        subtitle = "Street coffee hingga tempat ngopi suasana pedesaan",
        icon = Icons.Default.LocalCafe,
        startColor = Color(0xFF4E342E),
        endColor = Color(0xFF8D6E63)
    ),
    REKREASI(
        title = "Destinasi Rekreasi",
        subtitle = "Spot foto hits, ATV, & Jeep wisata Kaliurang",
        icon = Icons.Default.DirectionsCar,
        startColor = Color(0xFFBF360C),
        endColor = Color(0xFFF4511E)
    )
}