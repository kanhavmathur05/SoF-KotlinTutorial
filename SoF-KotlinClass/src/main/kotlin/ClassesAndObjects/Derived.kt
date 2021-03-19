package ClassesAndObjects

class Derived : Base {
    val q: Int = 20

    constructor() : super(10)

    init {
        println("init block of derived class")
    }

    override val size: Int
        get() = super.size.also { println() }
}
open class Persons(name:String) {

}
fun main(args: Array<String>) {
    Derived()

    fun Derived.multiply(a:Int, b:Int):Int{return a*b} //multiplly is an extra method
    //extended functionality of a derived class
    fun Derived.add(a:Int,b:Int,c:Int):Int{return a+b+c}
    val d=Derived();
    println(d.multiply(12,23))
    println(d.add(12,23,34));
}
