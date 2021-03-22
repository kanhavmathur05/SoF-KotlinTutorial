package Collections

val numbersMap = mutableMapOf("key1 " to 1, "key2 " to 2)

val studentsMap = mutableMapOf(1 to Student(1,"Max",200) ,2 to Student(1,"Ben",200))

val const: Int = 15

fun main(args: Array<String>) {

    val key: String = "key1"

    numbersMap.put("key31",77)
    println(numbersMap)
    println(numbersMap - "key21")
    println(numbersMap + Pair("key31",66))

    val otherFilteredMaps = numbersMap.filter { (key,value)->key.endsWith("1") }
    println(otherFilteredMaps)

    val filteredByKeys = numbersMap.filterKeys { it.endsWith("1") }
    println(filteredByKeys)

    val myVal = numbersMap.getOrDefault("key3", 10)
    val otherValue = numbersMap.getOrElse("key4", { numbersMap.get("key1") })

    println(otherValue)

//    numbersMap[key] = numbersMap.getValue("key1") + const;
//    println("New value of key1 ${numbersMap.getValue("key1")}")


    println("All the keys in the map ${numbersMap.keys}")
    println("All the values in the map ${numbersMap.values}")

    if ("key2" in numbersMap) println("value of key 2 is ${numbersMap["key2"]}")
    if (numbersMap.containsValue(1)) println("1 is present")


    println("All Students Keys ${studentsMap.keys}")
    println("All Students values ${studentsMap.values}")

    println(studentsMap)
    studentsMap.put(3,Student(3,"Manny",150))

//    val firstValue = studentsMap.filterKeys { it.endsWith(1) }

}

class Maps {

}