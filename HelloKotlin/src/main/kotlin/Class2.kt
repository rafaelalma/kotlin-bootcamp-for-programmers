// Main function

fun main() {
    swim()
    swim("slow")
    swim(speed = "turtle-like")
}

// Default values

fun swim(speed: String = "fast") {
    println("swimming $speed")
}
