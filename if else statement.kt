fun main(){
//    val isRaining = false
//
//    if (isRaining){
//        println("Take Umbrella ")
//    }
//    else{
//        println("No Rains --> Enjoy Your Day")
//    }

    val x = 11
    val y = 7

//    if (x > y){
//        println("X is greater")
//    }
//    else if (x < y){
//        println("Y is greater")
//    }
//    else{
//        println("Both are equal")
//    }
    // Another way to write if else

        /*val Result = if (x > y){
       "X is greater"
    }
    else if (x < y){
        "Y is greater"
    }
    else{
       "Both are equal"
    }
    print(Result)*/

    //With this we can use if else statement as an expression
    val number = 20
    val result = if (number % 2 == 0) "Even" else "Odd"
    print(result)

  }