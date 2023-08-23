// oop -> Object oriented Programming
//Paradigm which allows us to solve problems with the help of objects which represents the real world entities.

fun main(){
    val mustang = car("Mustang", "Petrol", 100)
    val Challenger = car("Dodge", "Petrol", 200)
    println(mustang.name)
    println(mustang.type)
    println(mustang.KmRan)
    println(Challenger.name)

    mustang.driveCar()
    Challenger.applyBrakes()
}

class car(val name: String, val type: String, var KmRan: Int)   //Class is a user defined data  type
{
fun driveCar(){  //methods
    println("$name Car is driving")
}
    fun applyBrakes(){
        println("$name Applied Brakes")
    }
}