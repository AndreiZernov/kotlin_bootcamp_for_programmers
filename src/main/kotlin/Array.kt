fun main() {
    intToStringNewArray()

    newArrayDivisibleBySeven()
}

fun intToStringNewArray () {
    val list: MutableList<String> = arrayListOf()
    for (i in 11..15) list.add(i.toString())
    println(list)
}

fun newArrayDivisibleBySeven () {
    var list = mutableListOf<Int>()
    for (i in 0..100) i % 7 == 0 && list.add(i)
    println(list)
}