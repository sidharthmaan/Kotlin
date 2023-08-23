
fun main(){
val Circlee = circlei(4.0)
println(Circlee.area())
Circlee.display()
}

abstract class shapei{
    var name : String = ""
    abstract fun area(): Double
    abstract fun display()
}

class circlei(val radius: Double) : shapei(){
    override fun area(): Double = Math.PI * radius * radius
    override fun display() {
        println("Circle is getting displayed")
    }
}

// Point of abstract class
// . Class can't be instantiated
// . Abstract class can have both abstract and non-abstract properties & methods
// . If a class has abstract method or property then class must be declared as abstract