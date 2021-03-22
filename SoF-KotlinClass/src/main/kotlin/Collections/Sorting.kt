package Collections

fun main(args:Array<String>) {
//    val shuffled= listOf(5,4,3,2,1,-4,-5,-10)
    val shuffled= mutableListOf(5,4,3,2,1,-4,-5,-10)
/*
    shuffled.add(9)

    shuffled.addAll(arrayOf(12,23,23,23))
    println(shuffled)*/
    val studentList= mutableListOf(Student(1, "Mark", 213), Student(2, "Tyson", 300)
            , Student(3, "Roger", 244), Student(4, "Max", 219))

    studentList.add(Student(5,"Ben",234))

    studentList.addAll(arrayOf(Student(6,"Goku",120),Student(7,"Virat",320)))


//    studentList.remove(Student(3, "Roger", 244))

    println(studentList)


    println(studentList.find { it.id==2 })
    studentList.remove(studentList[2])

    shuffled[2]=9
    println(shuffled.reverse())
//    println(studentList.retainAll{  })
    println(shuffled.average())
    println(shuffled.count())
    println(shuffled.sum())
    println(shuffled.sorted())
    println(shuffled.sortedBy{-it})
    println(shuffled.sortedByDescending { -it })
    println(shuffled.subList(3,6))

    shuffled.sort()
    println(shuffled.binarySearch(3))
//    println(shuffled.indexOf(1)) //Linear search
}