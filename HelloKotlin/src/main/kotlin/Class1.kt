import java.util.*

// Main function

fun main() {
    feedTheFish()
}

// Functions

fun feedTheFish() {
    val randomDay = randomDay()
    val food = fishFood(randomDay)
    println("Today is $randomDay and the fish eat $food.")
    println("Change water: ${shouldChangeWater(randomDay)}")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

// When expression

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

// Default values

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getDirtySensorReading(): Int {
    return 20
}

// Compact functions

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"