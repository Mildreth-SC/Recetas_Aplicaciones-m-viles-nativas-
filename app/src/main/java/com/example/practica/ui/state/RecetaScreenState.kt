package com.example.practica.ui.state

import com.example.practica.model.Receta

/**
 * Estado sellado (Sealed class) para manejar la navegación manualmente 
 * utilizando elevación de estado (State Hoisting), sin usar NavHost.
 */
sealed class RecetaScreenState {
    object Home : RecetaScreenState()
    object Catalog : RecetaScreenState()
    data class Detail(val receta: Receta) : RecetaScreenState()
}
