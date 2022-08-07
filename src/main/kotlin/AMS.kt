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
    if (fitMoreFish(tankSize = 30.0F, currentFish = listOf(1,2,3,4,5), fishSize = 2)) {
        println("Can fit this fish")
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

fun shouldChangeWater (
    day : String,
    temperature : Int = 22,
    dirty : Int = 20) : Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> false
        else -> true
    }
}

fun isTooHot (temperature : Int) = temperature > 30
fun isDirty (dirty : Int) = dirty > 30
fun isSunday (day : String) = day == "Sunday"

fun fitMoreFish (tankSize: Float, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}
