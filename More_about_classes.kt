fun main(){
    var i: Int = 20
    println(i.plus(30))
    println(i.toFloat())

    val p1 = person("Sid",21)
    val p2 = person("Simrat", 17)
    val p3 = person("Sujeet",18)

    println(p1.canVote())
    println(p2.canVote())
    println(p3.canVote())

}

class person(val name: String, val age: Int){

    fun canVote(): Boolean{
        return age>=18

    }
}