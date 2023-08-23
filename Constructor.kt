fun main(){
    val car = Automobile("Car",4,5,true)
    println("Airbags:-> " + car.airbags)
    println("Max Seating :-> " + car.maxSeating)
    println("Name :-> " + car.name)
    println("Tyres:-> "+ car.tyres)

    var person1 = Person("name", 20)
    println(person1.age)
    println(person1.name)



}

class Automobile(val name: String, val tyres:Int, val maxSeating: Int, hasAirBags: Boolean){
    // that variables which have val or var with their name is properties. Or that which have no val with
    // their name is known as parameter of the function which is define inside the class
    val airbags  = hasAirBags

  //  fun drive(){}
  //  fun applyBrakes(){}

}
//class Empty{}  //Empty class


class Person(nameParameter: String, ageParameter: Int){  // Parameterized class
    var name: String = nameParameter
    var age: Int = ageParameter

}


//    PRIMARY CONSTRUCTOR AND SECONDARY CONSTRUCTOR

//fun main(){
//    var car = Automobile("car","Petrol")
//    var car2 = Automobile("Car2", "Diesel")
//    var car3 = Automobile("car3",4,5,"Petrol")
//
//    println(car.name)
//    println(car2.enginetype)
//    println(car3.maxSeating)
//}
//
//class Automobile(val name: String,val tyres: Int, val maxSeating: Int,val enginetype: String){
//    init {
//        println("$name is created")
//    }
//    init {
//        println("Second initializer block")
//    }
//
//    constructor(nameparam: String, engineparam: String) : this(nameparam,4,5,engineparam)
//}