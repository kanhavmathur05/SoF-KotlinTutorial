package Collections

val sysUser: MutableList<Int> = mutableListOf(1, 2, 3)  //Equivalent code in java wil be comparatively long

val users: List<Int> = sysUser

fun addUser(newUser: Int) {
    sysUser.add(newUser)
}

fun getUser(): List<Int> {
    return users
}

fun main(args:Array<String>) {
    addUser(4)
    println("Total Users: ${getUser().size}")
    getUser().forEach{
        i -> println("User Info = $i")
    }
}