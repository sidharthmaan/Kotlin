fun main(){
    var arr = arrayOf("one", "two", "three")
    var arr1 = arrayOf(1,2,3)

    var arr2 = arrayOf<Int>(4,5,6)

    for (i in arr){
        println(i)
    }

    // 2nd way with index
    for ((i,e) in arr.withIndex()){   // In this i stands for Index or e stands for Element
        println("$i - $e")
    }
    println(arr[0])
    println(arr.get(1))
    arr.set(2,"Hello")
    println(arr.get(2))
    println(arr.size)
}