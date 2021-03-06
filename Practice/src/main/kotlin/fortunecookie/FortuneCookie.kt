package fortunecookie

fun main() {
    do {
        val fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
    } while (!fortune.contains("Take it easy and enjoy life!"))
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well",
        "Today is a good day for exercising restraint",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune"
    )

    return when (getBirthday()) {
        in 1..7 -> fortunes.first()
        8 -> fortunes[1]
        9 -> fortunes[2]
        in 10..15 -> fortunes[3]
        in 15..25 -> fortunes[4]
        26 -> fortunes[5]
        else -> fortunes.last()
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")

    return readLine()?.toIntOrNull() ?: 1
}