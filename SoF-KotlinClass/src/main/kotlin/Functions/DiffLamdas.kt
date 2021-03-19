package Functions

class DiffLamdas {
}

val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }
val upperCase2: (String) -> String = { str -> str.toUpperCase() }
val upperCase3 = { str: String -> str.toUpperCase() }
val upperCase4: (String) -> String = { it.toUpperCase() }
val upperCase5: (String) -> String =String::toUpperCase

fun main(args:Array<String>)
{
    println(upperCase1("Kanhav"))
    println(upperCase2("Kanhav"))
    println(upperCase3("Kanhav"))
    println(upperCase4("Kanhav"))
    println(upperCase5("Kanhav"))
}