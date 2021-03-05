package whatshouldidotoday

fun main() {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "sunny"))

    println("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isVeryHot(temperature: Int) = temperature > 35

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny(mood: String, weather: String, temperature: Int) =
    mood == "happy" && weather == "sunny" && temperature > 23

fun isSnowy(weather: String) = weather == "snowy"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappySunny(mood, weather, temperature) -> "Go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "Stay in bed"
        isVeryHot(temperature) -> "Go swimming"
        isSnowy(weather) -> "Go snowboarding"
        else -> "Stay home and read"
    }
}
