package ClassesAndObjects
/*Init blocks / static blocks in java are executed before the constructor whereas in Kotlin it
depends on the order of the block.
* */
/*
* Order of init block is changed and it get called in the sequence as it is.
* */
class InitDemo(name:String,age:Int=18){
    val firstProperty = "FirstProperty: $name".also(::println)
    val secondProperty = "SecondProperty: $name".also(::println)

    init {
        println("second inti block that prints ${name.length}")
    }

    init {
        println("first inti block that prints $name")
    }



}

fun main(args:Array<String>)
{
    InitDemo("hello")
}