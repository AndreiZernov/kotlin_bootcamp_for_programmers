import java.util.*

fun main() {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}