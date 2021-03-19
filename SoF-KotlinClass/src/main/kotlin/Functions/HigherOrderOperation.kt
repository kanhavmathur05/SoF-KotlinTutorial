package Functions

class HigherOrderOperation {

}

/*  fun nameOfFunc x-1st Param ,y-2nd Param, operation-3rd param
operation(firstParam: Int, secondParam: Int)
*/
fun Calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y


fun main(args: Array<String>) {
    var sumResult = Calculate(4, 5, ::sum)
    println(sumResult)
}