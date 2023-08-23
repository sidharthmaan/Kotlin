// Definition of polymorphism

// . Poly means Many & Morph means Form
// . In Computer Science, it is defined as - method name is same, but it will behave
//   differently based on the object


// Polymorphism :-> . Parent can hold a reference to its child
//                  . Parent can call methods of child classes (which are common).

fun main(){
val circle: Shape = Circle(4.0)
    val Square: Shape =  square(4.0)
//    println(circle.area())
//    println(Square.area())
    val shapes = arrayOf(Circle(3.0), triangle(3.0,4.0), square(4.0))
    calculateareas(shapes)
}

fun calculateareas(shapes: Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}
open class Shape{
    open fun area(): Double{
        return 0.0
    }

}
class Circle(val radius: Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class square(val side: Double) : Shape(){
    override fun area(): Double {
        return  side * side
    }
}
class triangle(val base: Double, val height: Double): Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}

//  Advantages of Polymorphism
// . Helps to write Maintainable & Extensible Code.
// . Helps in interacting with objects via common interface.