package org.example.Clases

data class Book (
    val ISBN: String,
    val Titulo: String,
    val Año: Int,
    val Autores: Set<Autor>
){
    fun has
}