package Collections


fun main(args: Array<String>) {
    val numbers = listOf("One", "Two", "Three", "Four")
    val longerThan3 = numbers.filter { it.length > 2 }

    println(longerThan3)
}