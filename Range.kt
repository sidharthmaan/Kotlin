fun main(){
//    val number = 10
//    val result = number in 1..5 //1,2,3,4,5   //Upper bound included
//    val Result = number in 1 until 11   //Upper Bound not included
//    println(result)
//    println(Result)

   //When uses in else if position

    val animal = "Dog"
//    if(animal == "horse") {
//        println("Animal is horse")
//    } else if (animal == "cat") {
//        println("Animal is cat")
//    } else if (animal == "Dog") {
//            println("Animal is dog")
//        } else {
//            println("Animal not found")
//        }

    // Using When Statement

//     val result = when(animal){
//        "Horse" -> ("Animal is Horse")
//        "Cat" -> ("Animal is Cat")
//        "Dog" -> ("Animal is Dog")
//        else -> ("Animal Not Found")
//    }
//    println(result)

    val number = 15
    val Result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Not in Range"
    }
    println(Result)

}