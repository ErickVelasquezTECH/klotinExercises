package org.example

//Un método que dados cuatro números enteros, calcula la media y la devuelve.

fun average (num1: Int ,num2: Int,num3: Int,num4: Int): Double=
    (num1+num2+num3+num4).toDouble()/4

fun averageImperativo (num1: Int ,num2: Int,num3: Int,num4: Int): Double=
    listOf(num1+num2+num3+num4).average()


fun main(){

    println(average(6,2,7,4))
    println(averageImperativo(6,2,7,4))
}
