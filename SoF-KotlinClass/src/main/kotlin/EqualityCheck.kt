fun main(args: Array<String>) {
    val authors = setOf<String>("Shakes","Hemmingway","Twain")
    val writers = setOf<String>("Shakes","Hemmingway","Twain")

    println(authors==writers)   //will ignore the order of elements--true
    println(authors===writers) //will not ignore the order of elements--false
}