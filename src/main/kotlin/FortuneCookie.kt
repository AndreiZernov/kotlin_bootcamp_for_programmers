fun main() {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

val listOfFortunes = listOf("You will have a great day!", "Take it easy and enjoy life!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take a day off and enjoy nature.", "You will have a very good day.", "I see you enjoy the good things in your life.", "You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take a day off and enjoy nature.", "You will have a very good day.", "I see you enjoy the good things in your life.")

fun getBirthday (): Int {
    print("Enter your birthday: ")
    return readLine()!!.toIntOrNull() ?: return 0
}

fun getFortuneCookie (birthday: Int): String {
    return when (birthday) {
        in 1..7 -> listOfFortunes[1]
        in 28..31 -> listOfFortunes[0]
        else -> listOfFortunes[birthday % listOfFortunes.size]
    }
}