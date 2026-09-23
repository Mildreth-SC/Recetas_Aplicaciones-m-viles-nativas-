package com.example.practica.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica.model.getRecetasDummy
import com.example.practica.model.Receta
import com.example.practica.ui.components.RecetaItem
import com.example.practica.ui.components.WatermarkBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecetaCatalogScreen(
    recetas: List<Receta>,
    onRecetaClick: (Receta) -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Catálogo de Recetas") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver atrás"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.fillMaxSize()) {
            // Fondo de agua
            WatermarkBackground()
            
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(top = 8.dp, bottom = 8.dp)
            ) {
                items(recetas) { receta ->
                    RecetaItem(
                        receta = receta,
                        onClick = { onRecetaClick(receta) }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecetaCatalogScreenPreview() {
    MaterialTheme {
        RecetaCatalogScreen(
            recetas = getRecetasDummy(),
            onRecetaClick = {},
            onBack = {}
        )
    }
}
