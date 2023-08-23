fun main(){
    val p1 = prson("Sid",20)
    println(p1.agee)
    p1.agee = 21
    p1.agee = -17
    println(p1.name)
}
class prson(nameParam: String, ageParam: Int){
    var name: String = nameParam

        get() {   // Geters are used to get the values.
            println("Name getter is called")
            return field.toUpperCase()           //Field is a special word in kotlin which is used to assign value.
        }
    var agee: Int = ageParam
        set(value) {   // it is used to set the values and checking the values
            if (value > 0 ){
                field = value     //Field is a special word in kotlin which is used to assign value.
            }
            else{
                println("Age can't be negative")
            }
        }
    var email:String = ""
        get() = field      //Field is a special word in kotlin which is used to assign value.
        set(value) {
            field = value       //Field is a special word in kotlin which is used to assign value.
        }
}