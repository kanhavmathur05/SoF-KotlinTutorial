package Collections

fun main(args:Array<String>) {
    val numbers = listOf("One","Two","Three","Four")

    println(numbers.any{it.endsWith("e")})
    println(numbers.none{it.endsWith("a")})
    println(numbers.all{it.endsWith("e")})
}