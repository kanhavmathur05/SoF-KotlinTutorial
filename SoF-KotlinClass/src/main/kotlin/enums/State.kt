package enums

enum class State {IDLE,FINISHED,RUNNING}

fun main(args:Array<String>)
{
    val state=State.RUNNING
    val message=when(state){
        State.RUNNING->"Its Running"
        State.FINISHED->"Its Finished"
        State.IDLE->"Its idle"
    }

    println(message)
}