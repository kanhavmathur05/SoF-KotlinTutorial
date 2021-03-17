open class Dog { //By default the classes are final soy if you want to extend it mark it open
    open fun sayHello() {    // If you want the method to be overridden then mark it with open
        println("Wow wow")
    }

    class Dauberman : Dog() {
        override fun sayHello() {
            println("How How")
        }
    }

}
fun main(args:Array<String>){
    val dog: Dog //reference is created on stack memory and object gets created in heap memory
            = Dog.Dauberman()  //Polymorphism
    dog.sayHello()
}