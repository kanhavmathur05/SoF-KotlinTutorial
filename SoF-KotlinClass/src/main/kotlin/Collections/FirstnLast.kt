package Collections

data class Product(val name:String, val quantity:Int)

fun main(args: Array<String>) {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val even = numbers.partition { it % 2 == 0 }
    val (positive, negatives) = numbers.partition { it > 0 }

//    Partitioning a Map
    val productMap = mapOf(
            "a" to Product("A", 100),
            "b" to Product("B", 200),
            "c" to Product("C", 300),
            "d" to Product("C", 400),
            "e" to Product("C", 500)
    )

    val (lessThan350, from350) = productMap.map { it.value }.partition { it.quantity < 350 }

    println("--- lessThan350 ---")
    lessThan350.forEach { println(it) }

    println("--- from350 ---")
    from350.forEach { println(it) }

    println("Even no's are $even.first")
    println("Even no's are $even.second")
    println("Positives are $positive")
    println("Negatives are $negatives")

    val first = numbers.first()
    val last = numbers.last()
    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }
    val totalCount = numbers.count()
    val totalEvenCount = numbers.count { it % 2 == 0 }


    println("First $first Last $last First Even $firstEven LastOdd $lastOdd Total Count $totalCount Total Even Count $totalEvenCount")
}