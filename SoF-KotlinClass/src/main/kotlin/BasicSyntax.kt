fun main(args: Array<String>)
{
    var a:String ="initial"
//    val a:String="initial"  //val is like final it will not allow to change the value of the variable 'a'
//    a="qwqwe1" //it will show error if val a
    var b : String?  /*  ? marks that variable can be null also if we remove the ? kotlin will not allow to store null values in the variable*/
    b=null          /*var b : String   b=null (null not allowed) */
    println("Hello World")
    println(42)
    println(sum(10, 20))
    println(multiply(12, 15))
    println(showGreeting("Good Morning"))
    a="dsfksdflsdf"

    val customer= Customer(123, "Max")
    println(customer.name)  //no getter to get name property
    customer.name="adfjkasd"//no setter to get name property
    println(customer.name)
    println(customer.id)
}

fun sum(a : Int,b: Int):Int //Full method body
{
    return a+b
}

fun multiply(a : Int,b: Int):Int=a*b //Function Without Brackets

fun showGreeting(message:String, from:String="hajkdjfs")=println("$from $message") //Function with default parameter