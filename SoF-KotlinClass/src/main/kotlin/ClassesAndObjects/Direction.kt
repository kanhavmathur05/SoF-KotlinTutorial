package ClassesAndObjects

enum class Directions {
    NORTH,SOUTH,WEST,EAST
}
enum class Color(val rgb:Int) {
    RED(0xff0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocolState {
    WAITING{ override fun signal() = TALKING },
    TALKING { override fun signal()=WAITING };

    abstract fun signal():ProtocolState
};



fun main(args:Array<String>) {
    println(Directions.EAST)
    println(Directions.EAST.ordinal)
    println(Directions.valueOf("EAST"))

}