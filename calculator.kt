fun main(){
    val ob = calculator()

    println("Enter a ")
    val a: Int = Integer.valueOf(readLine())
    println("Enter b ")
    val b: Int = Integer.valueOf(readLine())
//    val name = readLine()
//    val name1 = readLine()
//    println("your name is $name $name1")

// Upper comments are used for getting input by user.

    println(ob.add(a,b))
    println(ob.divide(a,b))
    println(ob.subtract(a,b))
    println(ob.multiply(a,b))

}

class calculator{
    fun add(a: Int, b: Int):Int
    {
        return a + b
    }
    fun multiply(a: Int, b: Int):Int
    {
        return a * b
    }
    fun subtract(a: Int, b: Int):Int
    {
        return a - b
    }
    fun divide(a: Int, b: Int):Int
    {
        return a / b
    }

}