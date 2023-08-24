fun main(){
    val p1 = Person(1,"Sid")
    val p2 = Person(1, "Sid")
    println(p1)      // yha pe to string method call ho rha ha jo ki any class me hota ha.
                     // Jab bhi hm kisi object ka reference print krvate ha to behind the seen to string method call hota hai.
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)

    val p3 = p1.copy()
    println(p3)
    val p4 = p2.copy(id = 4)
    println(p4)

    val (id: Int , name: String) = p1
    println(id)
    println(name)
    println(p1.component2())
}

 data class Person(val id: Int, val name: String)        // jab bhi koi data class bnae to uske parameter me ik parameter
                                                        // jrur define kre vo val bhi ho skta ha or var bhi.
 {

}