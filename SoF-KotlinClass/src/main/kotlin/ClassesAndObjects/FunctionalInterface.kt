package ClassesAndObjects

interface FunctionalInterface {
    fun accept(i:Int):Boolean
}
fun main()
{
    val isEven = object :FunctionalInterface{
        override fun accept(i: Int): Boolean {
            println("Accepting")
            return true
        }
    }
}