fun main(args: Array<String>) {
    var time = args[0].toInt()
    println("Good ${if (time < 12) "morning" else "night"}!")
}
