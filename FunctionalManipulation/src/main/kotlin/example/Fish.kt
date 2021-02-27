package example

data class Fish(var name: String)

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")
    myWith(fish.name) {
        println(capitalize())
    }

    // Return the result of applying the function
    fish.run { name }

    // Return the object after applying the function
    val fish2 = Fish("splashy").apply { name = "sharky" }
    println(fish2.name)

    // Return a copy of the object with the changes
    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })
    println(fish)
}

// Create a high-order function

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}