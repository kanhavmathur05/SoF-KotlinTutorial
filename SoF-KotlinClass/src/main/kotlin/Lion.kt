open class Lion(val name:String, val origin: String) {

    fun sayHello() = println("$name the lion is from $origin")
}

class AsiaticLion(name:String):Lion(name=name, origin = "India")

fun main(args:Array<String>) {
    val lion : Lion = AsiaticLion("rufo")
    lion.sayHello()
}