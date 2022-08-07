fun main(){
    whatShouldIDoToday("sad")
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24){
   when {
       mood == "happy" && weather == "sunny" -> println("go for a walk")
       mood == "sad" && weather == "rainy" -> println("Stay home and read.")
       else -> println("Stay home and read.")
   }
}