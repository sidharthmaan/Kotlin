// A class which access the properties of another class by getting inherited in that class is known as inheritance.
// In kotlin we can't inherit two classes in another class.

fun main(){
val mustang = Dodge()
    println("Dodge class is called which is inherited by Car class ")
    println( mustang.gear)
    println(mustang.method)
    mustang.changeGear()
    mustang.emergencyBrakes()

    println(mustang.automatic)
    println(mustang.engineCC)
    println(mustang.speed)

}

open class Car(){
    init {
        println("Always compiled without asking ")
    }
    val gear = 6
    open val method: String = "automatic"
    fun changeGear() = println("Gear changed when speed increasing")
   open fun emergencyBrakes() = println("When a object is came under 20 meter of the car emergency brakes applied ")

}
class Dodge: Car(){
    val automatic: Boolean = true
    val engineCC = 100
    val speed = "0 - 100 in 5 sec "
    override fun emergencyBrakes() = println("Emergency breaks applied ")
    override val method: String = "Manual"
}
