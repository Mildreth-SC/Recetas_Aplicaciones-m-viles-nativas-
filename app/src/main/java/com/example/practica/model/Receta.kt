package com.example.practica.model

/**
 * Modelo de datos para la entidad Receta.
 * Contiene 6 atributos como lo solicita el requerimiento: 
 * id, nombre, descripcionBreve, calorias (numérico), tiempoMinutos (numérico), imagenUrl (URI/URL).
 */
data class Receta(
    val id: Int,
    val nombre: String,
    val descripcionBreve: String,
    val calorias: Int,
    val tiempoMinutos: Int,
    val imagenUrl: String
)

/**
 * Función que retorna una lista de 8 registros dummy para iniciar la aplicación.
 */
fun getRecetasDummy(): List<Receta> {
    return listOf(
        Receta(
            id = 1,
            nombre = "Ensalada de Quinoa",
            descripcionBreve = "Fresca ensalada con quinoa, vegetales y vinagreta de limón.",
            calorias = 250,
            tiempoMinutos = 15,
            imagenUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=400&auto=format&fit=crop"
        ),
        Receta(
            id = 2,
            nombre = "Pollo al Horno con Vegetales",
            descripcionBreve = "Pechuga de pollo horneada con zanahorias, brócoli y especias.",
            calorias = 400,
            tiempoMinutos = 45,
            imagenUrl = "https://images.unsplash.com/photo-1598514982205-f36b96d1e8d4?q=80&w=400&auto=format&fit=crop"
        ),
        Receta(
            id = 3,
            nombre = "Smoothie Verde",
            descripcionBreve = "Batido desintoxicante de espinaca, manzana verde y apio.",
            calorias = 150,
            tiempoMinutos = 10,
            imagenUrl = "https://images.unsplash.com/photo-1610832958506-aa56368176cf?q=80&w=400&auto=format&fit=crop"
        ),
        Receta(
            id = 4,
            nombre = "Tacos de Lentejas",
            descripcionBreve = "Deliciosos tacos veganos rellenos de guiso de lentejas.",
            calorias = 320,
            tiempoMinutos = 25,
            imagenUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=400&auto=format&fit=crop"
        ),
        Receta(
            id = 5,
            nombre = "Salmón a la Plancha",
            descripcionBreve = "Filete de salmón rico en omega 3 con espárragos al vapor.",
            calorias = 450,
            tiempoMinutos = 20,
            imagenUrl = "https://images.unsplash.com/photo-1467003909585-2f8a72700288?q=80&w=400&auto=format&fit=crop"
        ),
        Receta(
            id = 6,
            nombre = "Avena Nocturna (Overnight Oats)",
            descripcionBreve = "Avena reposada en leche de almendras con chía y frutos rojos.",
            calorias = 280,
            tiempoMinutos = 5,
            imagenUrl = "https://www.bonviveur.com/es/images/webp/avena-nocturna.webp"
        ),
        Receta(
            id = 7,
            nombre = "Sopa de Calabaza",
            descripcionBreve = "Crema de calabaza natural con un toque de jengibre y semillas.",
            calorias = 210,
            tiempoMinutos = 30,
            imagenUrl = "https://images.unsplash.com/photo-1476718406336-bb5a9690ee2a?q=80&w=400&auto=format&fit=crop"
        ),
        Receta(
            id = 8,
            nombre = "Wrap de Atún",
            descripcionBreve = "Tortilla integral con atún, aguacate y espinaca fresca.",
            calorias = 310,
            tiempoMinutos = 10,
            imagenUrl = "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=400&auto=format&fit=crop"
        )
    )
}
