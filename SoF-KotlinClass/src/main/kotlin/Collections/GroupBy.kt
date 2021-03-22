package Collections

data class Person(val name: String, val city: String, val phone: String) {}

val people = listOf(Person("Tom", "Delhi", "9899789"),
        Person("Jerry", "Mumbai", "787987"),
        Person("Tyson", "Pune", "897897"),
        Person("Kai", "Pune", "98789798"))

fun main(args: Array<String>) {
    val phoneBook = people.associateBy { it.phone }
    println(phoneBook)
    val cityBook = people.associateBy(Person::phone, Person::city)
    println(cityBook)

    val peopleCities=people.groupBy ( Person::city,Person::name )
    println(peopleCities)
}