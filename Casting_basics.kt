
fun main(){
    val circle = Circle(4.0)
    val player = Player("Smiley")

    val arr = arrayOf(circle,player)
    for (obj in arr){
        if(obj is Circle){
            println( obj.area())
        }
        else{
            (obj as Player).SayMyName()
        }
    }

}


interface Draggable{
    fun drag()
}

abstract class Shape: Draggable{
    abstract fun area() :Double
}

class Circle(val radius: Double): Shape(){
    override fun area(): Double = Math.PI * radius * radius
    override fun  drag()= println("Circle is dragging")
}

class Player(val name: String): Draggable{
    override fun drag() = println("$name is dragging")
    fun SayMyName() = println("Hey, My name is $name")
}

