package Collections

fun main(args:Array<String>) {
    val words= listOf("lets","find","out","words","in","collection","somehow")

    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.startsWith("nothing") }
    println(first)
    println(last)
    println(nothing)
}


class FindLast {}