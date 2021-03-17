open class Tiger(val origin:String) {  //
    fun sayHello() = println("Hi I am from $origin")
}

class BengalTiger:Tiger("bengal")

fun main(args:Array<String>) {
    val tiger : Tiger
    tiger = BengalTiger()
    tiger.sayHello()
}