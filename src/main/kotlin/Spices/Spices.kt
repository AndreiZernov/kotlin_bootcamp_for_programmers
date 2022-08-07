package Spices

class Spice (val name: String, private val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 6
            "spicy" -> 7
            "very spicy" -> 8
            "extremely spicy" -> 10
            else -> 0
        }
    val listOfSpices = arrayListOf<Spice>()
    val spice: Spice
    init {
        spice = Spice(name, spiciness)
    }
}

class SimpleSpice {
    val name: String = "curry"
    private val spiciness: String = "mild"
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 6
            "spicy" -> 7
            "very spicy" -> 8
            "extremely spicy" -> 10
            else -> 0
        }
}