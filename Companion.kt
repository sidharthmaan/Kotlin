fun main(){
    MyClass.f()   // Directly access by using companion word without getting any permission.
    // only one companion is allowed in one class.
    MyClass.AnotherObject.G()
}

class MyClass {
    companion object Myobject {
        fun f() {
            println("Hello I am f from Object")
        }
    }

    object AnotherObject {
        fun G() {
            println("Hello I am G from Object")
        }
    }
}