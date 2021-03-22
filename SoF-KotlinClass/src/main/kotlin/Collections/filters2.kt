package Collections

//val studentList = mapOf("Anmol" to 1, "Anjali" to 2,"Mayank" to 3, "Akhil" to 4,"Shivani" to 5,"Prateek" to 6)

val studentList = mapOf("Axis_1" to "Anmol", "Axis_2" to "Anjali","Axis_3" to "Mayank" ,"Axis_4" to "Akhil" ,"Axis_5" to "Shivani" ,"Axis_6" to "Prateek")

fun main(args:Array<String>) {

//    val startsWith = studentList.filter { it.key.startsWith('A') }
    val startsWith = studentList.filter { it.value.startsWith('A') }

    println(startsWith)
}