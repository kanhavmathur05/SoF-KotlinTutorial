package Functions

class Lamdaz {
    var sum = { a: Int, b: Int -> a + b }

//    fun (s:String):Int{return s.toIntOrNull()?:0}   //anonymous function
}

val stringPlus: (String, String) -> String = String::plus

val intPlus:(Int,Int)->Int=Int::plus

fun main(args: Array<String>) {
    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }

    val twoParams: (String, Int) -> String = repeatFun

    fun runTransformation(f: (String, Int) -> String): String {

        return f("hello", 3)
    }

    val result = runTransformation(repeatFun)
    println("result= $result")

//    println(stringPlus.invoke(("asudfha","-asdkbcasd")))

    println(intPlus.invoke(12,23))

    println(stringPlus.invoke("hello","world"))
//    println(2.intPlus(3))
    println(intPlus.invoke(2,3))
     var sum={x:Int,y:Int -> x+y}
}