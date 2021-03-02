package whatshouldidotoday

fun main() {
    println(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" && temperature > 23 -> "Go for a walk"
        else -> "Stay home and read"
    }
}
