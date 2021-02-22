import java.util.*

fun main() {
    feedTheFish()
}

fun feedTheFish() {
    val randomDay = randomDay()
    val food = fishFood(randomDay)
    println("Today is $randomDay and the fish eat $food.")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "plankton"
    }
}
