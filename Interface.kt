// Group objects based on what they can do rather than what they are.
// To use polymorphism in unrelated set of classes (i.e.
//   classes which do not belong to same inheritance hierarchy

// COMMON TERMINOLOGY - Interface is a contract which states that whoever implements that interface has
//                      to provide the implementation for the methods.

fun main(){
    dragObjects(arrayOf(Circlee(4.0), Squaree(4.0), Trianglee(2.0,3.0)
    , Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }
}

interface Draggable{
    fun drag()
}

abstract class Shapee: Draggable{
    abstract fun area() : Double

}

class Circlee(val radius: Double): Shapee(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Squaree(val side : Double): Shapee(){
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class Trianglee(val base: Double, val height: Double): Shapee(){
    override fun area(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

class Player(val name: String): Draggable{
    override fun drag() = println("$name is dragging")
}

// Key Points
/*
*  Interface are meant for behaviours. Classes which exhibits that behavior implements that interface.
*  Interface can have both abstract and concrete methods.
*  Interface can implement other interfaces and one class can implement many interface
   but classes can have only one superclass.
   */