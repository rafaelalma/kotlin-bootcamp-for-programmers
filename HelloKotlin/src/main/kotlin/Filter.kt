// Filters. Eager and lazy

fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // Eager, creates a new list
    val eager = decorations.filter { it[0] == 'p' }
    println("Eager: $eager")

    // Lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("-----")
    println("Filtered: $filtered")

    // Force evaluation of the lazy list
    val newList = filtered.toList()
    println("New list: $newList")

    // Map function

    val lazyMap = decorations.asSequence().map {
        println("Access: $it")
        it
    }
    println("-----")
    println("Lazy: $lazyMap")
    println("-----")
    println("First: ${lazyMap.first()}")
    println("-----")
    println("All: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("Access: $it")
        it
    }
    println("-----")
    println("Filtered: ${lazyMap2.toList()}")
}