//// How we declare the object? -> OBJECT DECLARATION POINTS
//// Class and its single object is created at once.
//// No constructors are allowed (init block is allowed).
//// Singleton Pattern.
//// You can inherit class/interface.
//
//fun main(){
////    println(AB.num)
////    CD.test()
//    SharingWeight.incrementFBLikes()
//    SharingWeight.incrementTwitterLikes()
//    SharingWeight.incrementTwitterLikes()
//    SharingWeight.incrementFBLikes()
//    SharingWeight.display()
//}
//
////object AB{
////    val num = 10
////}
////
////object CD{
////    val p: Int = 20
////    fun test(){
////        println("I am a object CD")
////    }
////}
//
////   SINGLETON PATTERN
//object SharingWeight{
//    private var twitterLikes = 0
//    private var fbLikes = 0
//
//    fun incrementTwitterLikes() = twitterLikes++
//    fun incrementFBLikes() = fbLikes++
//    fun display() = println("Facebook - $fbLikes -- Twiter - $twitterLikes")
//}

//   ANONYMOUS OBJECTS
fun main(){
    var testobj = object{
        val x: Int = 10
        fun method(){
            println("I am a object expression")
        }
    }
    println(testobj.x)
    println(testobj.method())
}

// Kotlin k ander hm ik anonymous object bhi bna skte ha, but vo sirf ik he object bne ga
// or vo define bhi hmm main function me kr skte hai.