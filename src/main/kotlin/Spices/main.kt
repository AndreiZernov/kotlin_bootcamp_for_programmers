import Spices.SimpleSpice

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curries = spices.filter { it.contains("curry") }
    val sortedCurries = curries.sorted()
    val newFilteredSpices = spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' }
    val firstThree = spices.take(3).filter { it[0] == 'c' }
    println("curries: $curries")
    println("sortedCurries: $sortedCurries")
    println("newFilteredSpices: $newFilteredSpices")
    println("firstThree: $firstThree")

    val spiciness = SimpleSpice()
    println("spiciness name: ${spiciness.name}")
    println("spiciness heat: ${spiciness.heat}")
}