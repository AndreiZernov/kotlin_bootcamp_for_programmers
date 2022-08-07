package Aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} litters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} litters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium: ${myAquarium2.volume} litters with" +
            "length: ${myAquarium2.length} fish" +
            "width: ${myAquarium2.width} fish" +
            "height: ${myAquarium2.height} fish")

}