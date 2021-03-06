package rolldice

import kotlin.random.Random

fun main() {
    val rollDiceSides = { sides: Int -> Random.nextInt(1, sides) }

    val rollDiceSidesZero = { sides: Int -> if (sides == 0) 0 else Random.nextInt(1, sides) }

    val rollDiceSidesZeroFunc: (Int) -> Int = { sides -> if (sides == 0) 0 else Random.nextInt(1, sides) }

    gamePlay(rollDiceSides(6))
    gamePlay(rollDiceSidesZero(0))
    gamePlay(rollDiceSidesZeroFunc(6))
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}