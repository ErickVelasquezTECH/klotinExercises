package org.example
//Sin hacer//
//3. Un método que dado un entero,devuelva el sumatorio de cero a ese número.
// Por ejemplo, si se pasa el 6, el resultado será 0 +1 +2 +3 +4 +5+ 6.

fun sumatorio( num : Int) : Int {

    var res =0

    for ( i in 1 .. num) {
        res += 1
    }
    return res
}
fun main(){
    println(sumatorio(num = 6))
    println(sumatorio(6))
}