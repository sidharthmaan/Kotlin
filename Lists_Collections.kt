fun main(){

//  This is the immutable list.

//    val nums = listOf(1,2,3)
//    println(nums.indexOf(3))
//    println(nums.contains(7))

    //  Mutable List

    val nums = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    nums.add(7)
    println(nums.contains(7))
    nums.remove(2)
    println(nums)

    val list2 = listOf(2,4,5,6,8)
    nums.addAll(list2)
    println(nums)
}