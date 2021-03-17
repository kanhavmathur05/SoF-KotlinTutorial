fun main(args:Array<String>)
{
    cases(1)
    cases("Hello")
}
fun cases(obj: Any)
{
    when(obj) {
        1-> println("One")
        "Hello"-> println("Greeting Message")
    }
}