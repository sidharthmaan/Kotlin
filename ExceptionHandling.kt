import java.lang.Exception

//fun main(){
//    val arr = arrayOf(1,2,3)
//    try {
//        println(arr[5])
//    }
//    catch (e: Exception){
//        println("Please check the array index")
//    }
//    finally {
//        println("I will execute no matter what")
//    }
////   We can define multiple catch block to catch the exception.
////   We can't initialize try block single, with try block we have
////   to initialize catch or finally block
//    println("This will not run")
//}

fun main(){
    createUserList(5)
    createUserList(10)
    createUserList(0)
    createUserList(-2)


}

fun createUserList(count: Int){
    if(count<=1){
        // Exception raise
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User list created containing $count users")
    }
}