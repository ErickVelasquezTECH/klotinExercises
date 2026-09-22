package nullExercises


fun main(){
    printName(null)
}

fun getOrZero(number: Int?): Int=
    number?:0

fun printName(name: String?): Unit=
    println(name?: "Nombre desconocido")

fun getLength(name: String?): Int?=
    name?.length

fun first(numbers: List<Int>): Int?{
    if (numbers.isEmpty()){
        return null
    }
    return numbers.first()
}



fun  average( numbers: List<Double> ): Double?{
    if (numbers.isEmpty()){
        return null
    }
    return numbers?.average()
}

fun max( numbers: List<Double> ): Double?{
    if (numbers.isEmpty()){
        return null
    }
    return numbers.max()
}
fun min( numbers: List<Double> ): Double?{
    if (numbers.isEmpty()){
        return null
    }
    return numbers.min()
}