fun main(){
    var gender: String = "Male"  //  "Female", "Others"
    var gender2: String? = null
    var isAdult: Boolean? = null

    if (gender2 != null) {
       println(gender2.toUpperCase())
    }
    println(gender2?.toUpperCase())

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }
    var selectedvalue = gender2 ?: "NA"
//    var value = gender2!!.toUpperCase()
}