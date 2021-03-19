package Functions

import ClassesAndObjects.User

class ExtensionFunctions {}

data class User(val name: String, val age: Int)

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItem(): Float = this.items.maxBy { it.price }?.price ?: 0F

fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO Products"

fun main(args: Array<String>) {
    val order = Order(listOf(Item("Bread", 40.0f),
            Item("Butter", 200.0f)))

    println("Max priced item value is ${order.maxPricedItem()}")
    println("Max priced item Name is ${order.maxPricedItemName()}")

    val firstUser = User("Max", 23)

    val secondUser = User("Max", 23)

    println(firstUser)
    println(secondUser)
    println("First == second ${firstUser == secondUser}")

    println(firstUser.hashCode())

    println(firstUser.copy())

    println("Name = ${firstUser.component1()}")
    println("Age = ${firstUser.component2()}")
}