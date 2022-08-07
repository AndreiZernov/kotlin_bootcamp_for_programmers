fun main(){
    whatShouldIDoToday("rainy", 40)
}

fun whatShouldIDoToday (weather: String = "sunny", temperature: Int = 24){
    println("How do you feel today?")
    var mood = readLine()

   when {
       mood == "happy" && weather == "sunny" -> println("go for a walk")
       mood == "sad" && weather == "rainy" -> println("Stay home and read.")
       mood == "sad" && weather == "rainy" && temperature == 0 -> println("stay in bed")
       temperature > 35 -> println("go swimming")
       else -> println("Stay home and read.")
   }
}