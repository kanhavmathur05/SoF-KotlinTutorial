class Animal (val name:String)

class Zoo(val animals:List<Animal>) {
    operator fun iterator():Iterator<Animal> {
        return animals.iterator();
    }
}

fun main(args:Array<String>) {
    val zoo = Zoo(listOf(Animal("Zebra"),Animal("Tiger")))
    for(animal in zoo)
    {
        println("animal name is ${animal.name}")
    }
}