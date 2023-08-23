import kotlin.math.pow

// Function overloading is known as the function which have same name with different parameters.

fun main(){
   println(addition(3,4))
    println(addition(2.1,4.9))

    var fn = ::power
    print("2 Power 3 is ")
    println(fn(2.0,3.0))
    }

fun addition(a: Int, b: Int): Int{
    return a + b
}

fun addition(a: Double, b: Double): Double{
    return a+b
}

fun power(a: Double, b: Double): Double{
    return a.pow(b)
}