package example.myapp.decor

data class Decoration(val rocks: String)

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun main() {
    makeDecorations()
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