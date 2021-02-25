package example.myapp.decor

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

data class Decoration(val rocks: String)

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun main() {
    // makeDecorations()

    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

fun makeDecorations() {
    val decoration = Decoration("granite")
    println(decoration)

    val decoration1 = Decoration("slate")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    println(decoration.equals(decoration1))
    println(decoration1 == decoration2)
    println(decoration1 === decoration2)

    val decoration3 = Decoration2("crystal", "wood", "diver")
    println(decoration3)

    // Destructuring
    // Assign all properties to variables.
    val (rock, _, diver) = decoration3
    println(rock)
    println(diver)
}