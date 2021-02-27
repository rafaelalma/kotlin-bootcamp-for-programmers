package example

fun main() {
    labels()
}

fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")

        // Jumps to the execution point right after the loop marked with outerLoop
        if (i > 9) break@outerLoop
    }
}