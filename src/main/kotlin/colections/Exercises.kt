package colections

import kotlin.text.equals



fun main(): Unit {
    val numbers1 = mutableListOf(1.0, 2.0, 3.0, 4.0)
    val numbers2 = mutableListOf(1.0, 5.0, 6.0, 2.0)
    
    val numberfuction=junction(numbers1,numbers2)

    println(numberfuction)
}

fun readAnswer(message: String): Boolean{
    while (true){
        println(message)
        val answer = readln()
        if (answer.equals("si", ignoreCase = true) || answer.equals("s", ignoreCase = true)) {
            return true;
        } else if (answer.equals("no", ignoreCase = true) || answer.equals("n", ignoreCase = true)){
            return false;
        }else{
            println("No es valida la respuesta")
        }
    }
}


fun one(): Unit {
    val listString = mutableListOf<String>();
    var input = false;
    do {
        println("Introduce una palabra")
        listString.add(readln())
        input=readAnswer("Quieres introducir otra palabra? Si/No")
    } while (input)
    println(listString)
}
fun first(list: List<String>): String = list.first()

fun last(list: List<Int>): Int = list.last().or(0)

fun sum10(numbers: List<Int>): List<Int> =
    numbers.map { it + 10 }

fun mapToEmails(students: List<Student>): List<String> =
    students.map { it.email }

fun filterByZipCode(students: List<Student>, zipCode: Int): List<Student> =
    students.filter { it.zipCode == zipCode }


fun filterPairNumbers(numbers: List<Int>): List<Int> =
    numbers.filter { it % 2 == 0 }

fun sum(numbers: List<Double>): Double {
    if (numbers.isEmpty()) {
        return 0.0
    }
    return numbers.sum();
}

fun junction(numbers1: List<Double>, numbers2: List<Double>): List<Double> =
    numbers1.filter { numbers2.contains(it) }

