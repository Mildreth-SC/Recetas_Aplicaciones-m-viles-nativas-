package com.example.practica.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.practica.model.getRecetasDummy
import com.example.practica.ui.screens.RecetaCatalogScreen
import com.example.practica.ui.screens.RecetaDetailScreen
import com.example.practica.ui.screens.RecetaHomeScreen
import com.example.practica.ui.state.RecetaScreenState

/**
 * Componente principal que actúa como State Holder.
 * Aquí se aplica la elevación de estado (State Hoisting) para coordinar 
 * la navegación y los datos sin usar ViewModel ni NavHostController.
 */
@Composable
fun RecetaApp() {
    // Elevación de estado: recordamos la pantalla actual---StateOF -ES
    var currentScreen by remember { mutableStateOf<RecetaScreenState>(RecetaScreenState.Home) }
    
    // Elevación de estado: recordamos la lista de recetas
    val recetas = remember { getRecetasDummy() }

    when (val screen = currentScreen) {
        is RecetaScreenState.Home -> {
            RecetaHomeScreen(
                onNavigateToCatalog = { currentScreen = RecetaScreenState.Catalog }
            )
        }
        is RecetaScreenState.Catalog -> {
            RecetaCatalogScreen(
                recetas = recetas,
                onRecetaClick = { recetaSeleccionada -> 
                    currentScreen = RecetaScreenState.Detail(recetaSeleccionada)
                },
                onBack = { currentScreen = RecetaScreenState.Home }
            )
        }
        is RecetaScreenState.Detail -> {
            RecetaDetailScreen(
                receta = screen.receta,
                onBack = { currentScreen = RecetaScreenState.Catalog }
            )
        }
    }
}
