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
            imagenUrl = "https://ejemplo.com/imagenes/quinoa.jpg"
        ),
        Receta(
            id = 2,
            nombre = "Pollo al Horno con Vegetales",
            descripcionBreve = "Pechuga de pollo horneada con zanahorias, brócoli y especias.",
            calorias = 400,
            tiempoMinutos = 45,
            imagenUrl = "https://ejemplo.com/imagenes/pollo.jpg"
        ),
        Receta(
            id = 3,
            nombre = "Smoothie Verde",
            descripcionBreve = "Batido desintoxicante de espinaca, manzana verde y apio.",
            calorias = 150,
            tiempoMinutos = 10,
            imagenUrl = "https://ejemplo.com/imagenes/smoothie.jpg"
        ),
        Receta(
            id = 4,
            nombre = "Tacos de Lentejas",
            descripcionBreve = "Deliciosos tacos veganos rellenos de guiso de lentejas.",
            calorias = 320,
            tiempoMinutos = 25,
            imagenUrl = "https://ejemplo.com/imagenes/tacos.jpg"
        ),
        Receta(
            id = 5,
            nombre = "Salmón a la Plancha",
            descripcionBreve = "Filete de salmón rico en omega 3 con espárragos al vapor.",
            calorias = 450,
            tiempoMinutos = 20,
            imagenUrl = "https://ejemplo.com/imagenes/salmon.jpg"
        ),
        Receta(
            id = 6,
            nombre = "Avena Nocturna (Overnight Oats)",
            descripcionBreve = "Avena reposada en leche de almendras con chía y frutos rojos.",
            calorias = 280,
            tiempoMinutos = 5,
            imagenUrl = "https://ejemplo.com/imagenes/avena.jpg"
        ),
        Receta(
            id = 7,
            nombre = "Sopa de Calabaza",
            descripcionBreve = "Crema de calabaza natural con un toque de jengibre y semillas.",
            calorias = 210,
            tiempoMinutos = 30,
            imagenUrl = "https://ejemplo.com/imagenes/sopa.jpg"
        ),
        Receta(
            id = 8,
            nombre = "Wrap de Atún",
            descripcionBreve = "Tortilla integral con atún, aguacate y espinaca fresca.",
            calorias = 310,
            tiempoMinutos = 10,
            imagenUrl = "https://ejemplo.com/imagenes/wrap.jpg"
        )
    )
}
