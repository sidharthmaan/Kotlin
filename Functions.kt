// Function is define as the block of code or the set of code to perform certain function
// Helps to reuse codes
fun main(){
//    var a = 5
//    var b = 3
//    val result = add(4,5)
//    println(result)
//
//    val result2 = add(4,7)
//    println(result2)
//}
//
//fun add(num1: Int, num2: Int) = num1 + num2           //:-> Inline Function
//
//   val result = EvenOrOdd(10)
//    println(result)
    EvenOrOdd(12)
    EvenOrOdd(13)
    EvenOrOdd(5)
    EvenOrOdd(4)

    printmessage(3)  // argument
    printmessage()       //Default Arguments. In this the value which is passed in the function is taken

}


fun EvenOrOdd(num3: Int){
   /*
    For checking all even or odd numbers which is traverse in loop
    var i = 1
    while (i <= num3) {
        if (i % 2 == 0) {
            println(i.toString() + " = " + "Is the even number")
        }
        else{
            println(i.toString() + " = " + "Is the odd number")
        }
        i++
    }*/

    // Another Way

    val result = if (num3 % 2 == 0) "Even" else "Odd"
    println(result)
}

// Default Arguments Function

fun printmessage(count: Int = 2){ // Count = parameter. These parameters are val type. We can't reassign it.
    for (i in 1..count){
        println("Hello $i")
    }

}
