package com.example.practica.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun WatermarkBackground(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        AsyncImage(
            // Imagen de fondo (hojas / comida saludable) para la marca de agua
            model = "https://images.unsplash.com/photo-1490818387583-1b0ba689a07a?q=80&w=800&auto=format&fit=crop",
            contentDescription = "Fondo de agua",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.15f) // Baja opacidad para que sea una marca de agua
        )
    }
}
