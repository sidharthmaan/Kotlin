import jdk.incubator.vector.VectorOperators.Test

fun main(){
    val objA = A()
    val objB = B()

    println(objA.p)
    println(objA.r)

    objB.test()
}

class D  // In Kotlin all the class , variables and fun are always Public
         // We can use this in another class easily. Public means everywhere accessible

internal class E      // Internal modifier is used in a module. In one module in which you work can access
                       // Internal modifier. You don't access this in next module or next project. Same as public modifier

private class C    // We use private in a given class only or with in a file.



var b = 20

fun gn(){

}

open class A{
    public var p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40    // Protected can be accessible in subclasses
}

class B:A(){
    fun test(){
        println(p)
        //println(q)        private can't be accessible outside the Class
        println(r)
        println(s)
    }
}