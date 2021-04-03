package Practice

fun main(args: Array<String>) {
    var arr = arrayOf(1, 2, 3, 4, 5)
    for (i in arr.indices) {
        println(i)
    }
    var i = 0
    while (i < arr.size) {
        println(i)
        i++
    }

    val x: String = "laisdj"

    when (x) {
        "asdklfa" -> println("aklsdjf")
    }

}