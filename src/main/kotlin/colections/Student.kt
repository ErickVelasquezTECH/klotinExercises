package colections

data class Student(
    val name: String,
    val surname: String,
    val email: String,
    val zipCode: Int
)

fun filterByZipCode(students: List<Student>, zipCode: Int): List<Student> =
    students.filter { student -> student.zipCode == zipCode }
