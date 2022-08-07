fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
}

fun feedTheFish () {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Should change water")
    }
}

fun randomDay () : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week.random()
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "plankton"
        "Sunday" -> "small fish"
        else -> "fasting"
    }
}

fun shouldChangeWater (day : String, temperature : Int = 22, dirty : Int = 20) : Boolean {
    return true
}