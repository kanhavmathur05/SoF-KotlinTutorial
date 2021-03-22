package Collections

val openIssues: MutableSet<String> = mutableSetOf("first", "second", "third", "fourth","seventh")
val secondSet: MutableSet<String> = mutableSetOf("fifth", "sixth", "seventh", "eighth","second")

fun addIssue(uniqueString: String): Boolean {
    return openIssues.add(uniqueString)
}

fun isAdded(done: Boolean): String {
    if (done) return "Added Sucessfully" else return "Could'nt Add, It's already there."
}

fun main(args: Array<String>) {
    val issue: String = "fourth"
    val alreadyAdded: String = "second"




    println(openIssues union (secondSet))
    println(openIssues intersect (secondSet))
    println(openIssues subtract (secondSet))


/*    println("Issue $issue ${isAdded(addIssue(issue))}")

    openIssues.forEach({ i -> println("$i") })
    println()
    openIssues.forEach({ i -> println("$i") })
    println()
    openIssues.forEach({ i -> println("$i") })
    println()
    openIssues.forEach({ i -> println("$i") })
    println()
    openIssues.forEach({ i -> println("$i") })*/
}