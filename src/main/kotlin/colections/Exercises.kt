package colections


fun main(): Unit {
    val listString = mutableListOf<String>();
    var input = false;
    do {
        println("Introduce una palabra")
        listString.add(readln())
        println("Quieres introducir otra palabra? s/n")
        val answer = readln().toString();
        if (answer.equals("S", ignoreCase = true)) {
            input = true;
        } else {
            input = false;
        }
    } while (input != false)
    listString.stream().forEach { s -> println(s) }
}


fun first(list: List<String>): String = list.first()

fun last(list: List<Int>): Int = list.first()

fun sum10(numbers: List<Int>): List<Int> =
    numbers.map { x -> x + 10 }

fun mapToEmails(students: List<Student>): List<String> =
    students.map { student -> student.email }


fun filterPairNumbers(numbers: List<Int>): List<Int> =
    numbers.filter { n -> n % 2 == 0 }

fun sum(numbers: List<Double>): Double {
    if (numbers.isEmpty()) {
        return 0.0
    }
    return numbers.sum();
}

fun junction(numbers1: List<Double>, numbers2: List<Double>): List<Double> =
    numbers1.filter { n -> numbers2.contains(n) }

