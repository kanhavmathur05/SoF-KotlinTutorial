package Collections

data class Student(val id: Int, val name: String, val marks: Int)

fun main(args: Array<String>) {
    val nos = listOf(1, 2, 3)

    val listOfStudents = listOf(Student(1, "Mark", 213), Student(2, "Tyson", 300)
            , Student(3, "Roger", 244), Student(4, "Max", 219))

//    sort by student marks
    println("Min = ${listOfStudents.minBy { it.marks }}  Max=${listOfStudents.maxBy { it.marks }}")

    println("min = ${nos.min()} max=${nos.max()}")
}