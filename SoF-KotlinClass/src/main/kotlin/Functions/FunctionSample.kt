package Functions

import com.sun.corba.se.impl.orbutil.graph.Graph
import sun.security.provider.certpath.Vertex

open class FunctionSample {
    open fun double(y: Int = 1, x: Int) = 2 * x
}

class SecondFunc : FunctionSample() {

    var globalVar: Int = 10

    override fun double(x: Int, y: Int) = 2 * x
}


fun dfs(graph: Graph) {
    var a: Int
    fun bfs(current: Vertex, visities: MutableSet<Vertex>) {}
}

//Example of a lambda function
fun foo(
        bar: Int = 0,
        qux: () -> Unit
) {
    qux()
}

fun <T> singletonList(item: T): List<T> {
    return listOf()
}  //generic function

val eps = 1E-10
tailrec fun findFixPoint(x: Double = 1.0) {
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
}

fun reformat(
        str: String,
        upperCaseFirstLetter: Boolean = false,
        normalizeCase: Boolean = true,
        wordSeperator: Char = ' '
) {
}

fun variableNoArgs(vararg string: Int) {}

fun printHello(name: String?): Unit {
    if (name != null) {
        println("Hello $name")
    }
}

infix fun Int.times(x: Int): Int {
    return x
}

fun triple(x: Int): Int {
    return x * 3
}

fun main(args: Array<String>) {

    reformat("max", true)

    val result = FunctionSample().double(x = 10)
    println(result)

    foo(qux = { println("Hello") })
}