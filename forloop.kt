fun main(){
//    for(i in 1..5){
//        println(i)
//    }
//        for(i in 1..5 step 2) {
//            // step is used to increment by more than one. Depends on us. Or Used to iterate
//            println(i)
//        }
//
//            println("Uses of Until in for loop")
//            for(j in 1 until 5){
//                // Until is used when we don't consider upper bound
//                // Difference between IN or UNTIL is in (IN) UpperBound has considered or
//                // in (UNTIL) upperbound cannot consider
//                println(j)
//            }
//    for (i in 10 downTo 1){
//        println(i)
//    }

    var number = 2

    for (i in 1..10){
        //println(number.toString() + " * " + i + " = " + (number * i))

        // String Templating:->
        println("$number * $i = ${number * i}")
    }

    }
