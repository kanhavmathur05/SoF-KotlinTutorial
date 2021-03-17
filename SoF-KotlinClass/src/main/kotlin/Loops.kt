fun main(args:Array<String>) {

    var cakesEaten=0 //Kotlin can infer that cake eaten is of type Int
    var cakesBaked=0

    while(cakesBaked<5) {
        eatACake()
        cakesEaten++

    }

    do {
        bakeACake()
        cakesBaked++
    }
    while(cakesBaked<cakesEaten)

    val cakes = listOf<String>("Vanilla","Chocolate","Japanese")

    for( cake in cakes) println("$cake")
}

fun eatACake()=println("Eat A Cake")
fun bakeACake()=println("Bake A Cake")