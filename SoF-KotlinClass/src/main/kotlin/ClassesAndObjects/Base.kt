package ClassesAndObjects

open class Base(p:Int) {
        init {
            println("initialising base class")
        }
    open val size:Int =p.also { println("init p in base class") }
}