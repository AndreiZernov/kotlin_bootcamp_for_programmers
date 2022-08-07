fun main() {
    val roll: (Int) -> Int = { sides -> (0..sides).random() }
    println(roll(0))
}
