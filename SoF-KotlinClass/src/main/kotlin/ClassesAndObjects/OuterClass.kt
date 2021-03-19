package ClassesAndObjects

class OuterClass {
    private var buildingNo:Int=1
    class NestedCompany{
        fun developSw()="sw"
    }
}

fun main(args:Array<String>)
{
    val demo=OuterClass.NestedCompany().developSw()
}