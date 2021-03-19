package ClassesAndObjects

class Gst:IncomeTax() {
    override fun calculateTax(income:Int):Int {
        var oldTax=super.calculateTax(income)
        return oldTax+income/5
    }
}

fun main(args:Array<String>)
{
    val tax=Gst().calculateTax(120)
    println("Tax: $tax")
}