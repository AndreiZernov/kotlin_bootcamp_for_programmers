fun main() {
    for (i in 1..9) {
        var result = getFortuneCookie()
        println(result)
        if (result.contains("Take it easy")) break
    }
}

fun getFortuneCookie (): String {
    var listOfFortunes = listOf("You will have a great day!", "Take it easy and enjoy life!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take a day off and enjoy nature.", "You will have a very good day.", "I see you enjoy the good things in your life.", "You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take a day off and enjoy nature.", "You will have a very good day.", "I see you enjoy the good things in your life.")
    print("Enter your birthday: ")
    var birthday = readLine()!!.toIntOrNull() ?: return "Invalid birthday"
    return listOfFortunes[birthday % listOfFortunes.size]
}