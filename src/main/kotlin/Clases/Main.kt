package org.example.Clases

data class Persona(val nombre: String, val edad: Int)

fun main() {
    val persona1 = Persona("Juan", 30)
    val persona2 = Persona("Juan", 30)

// `equals()` es generado automáticamente
    println(persona1 == persona2)  // Imprime: true

// `toString()` también está implementado automáticamente
    println(persona1)  // Imprime: Persona(nombre=Juan, edad=30)

// `copy()` permite copiar un objeto con algunas propiedades modificadas
    val persona3 = persona1.copy(edad = 31)
    println(persona3)  // Imprime: Persona(nombre=Juan, edad=31)
}