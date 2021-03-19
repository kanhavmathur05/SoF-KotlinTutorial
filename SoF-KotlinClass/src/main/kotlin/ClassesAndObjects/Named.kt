package ClassesAndObjects

interface Named {
    val name:String
}

interface Person:Named {
    val firstName:String
    override val name:String get() = ""
}

data class Employee(override val firstName:String, val salary:Int):Person