package org.example
//Sin hacer//
//Un método que dado un número entero, devuelve el factorial de ese número.
// Por ejemplo, si se pasa el 6, el resultado será 1 * 2 * 3 * 4 * 5 * 6

fun factorialImperativo( num : Int) : Int {

    var res =1

    for ( i in 1 .. num) {
        res += 1
    }
    return res
}

fun main(){

}