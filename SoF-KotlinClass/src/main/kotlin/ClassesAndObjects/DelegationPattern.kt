package ClassesAndObjects


interface DoctorCoat {
fun treatPatient()
}

class ActualDr(val x:Int):DoctorCoat {
    override fun treatPatient() {
        print(x)
    }

}

class FakeDr(b: DoctorCoat): DoctorCoat by b

class DelegationPattern {

}

fun main(args:Array<String>) {
    val actualDoctor = ActualDr(10)
    FakeDr(actualDoctor).treatPatient()
}