package enums

sealed class Mammal(val name:String)

class Cat(val catName:String):Mammal(catName)
class Human(val humanName:String, val job:String):Mammal(humanName)

fun greetMammal(mammal: Mammal):String {
    when(mammal) {
        is Human-> return "Hello ${mammal.name} you are working as ${mammal.job}"
        is Cat-> return "Hello ${mammal.name}"
    }
}
fun main(args:Array<String>)
{
//    val mammal1=Human("Rocky","Boxer")
//    val mammal2=Cat("Mr. Cat")
//    greetMammal(mammal1)
//    greetMammal(mammal2)
    greetMammal(Cat("Katty"))
}