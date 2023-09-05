fun main(){

    //  Mutable map

//    val students = mutableMapOf<Int, String>()
//    students.put(1, "Sid")
//    students.put(2, "Simran")
//    students.put(3, "Taran")
//    students.put(4, "Simrat")
//
//    println(students.get(1))
//    println(students.get(6))
//
//    for ((key, value) in students){
//        println("$key = $value")
//    }
//
//    students[8] = "Sidharth"
//    println(students.get(8))
//    println(students[8])


    //  Immutable map
    val map = mapOf<Int, String>(1 to "Hello", 2 to "Sidharth")
    println(map)

}