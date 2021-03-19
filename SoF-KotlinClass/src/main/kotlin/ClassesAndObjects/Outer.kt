package ClassesAndObjects

open class Outer {
    private val a=1
    protected open val b=2
    internal val c=3
    val d=4 //public by default
    class inner {
        public val e:Int = 5
    }
}

class Subclass: Outer() {
    override val b=2
}