fun main(){
    val day = Day.Sunday
    println(day)
    println(day.number)

    for (i in Day.values()){
        println(i)
    }
    println(day.PrintFormatedDays())
}

enum class Day(val number: Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun PrintFormatedDays(){
        println("Day is $this")

    }
}