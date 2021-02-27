package example

class KotlinRun {
    companion object {
        fun runNow(runnable: Runnable) {
            runnable.run()
        }
    }
}

fun main() {
    runExample()
    runExample2()
}

fun runExample() {
    val runnable = object : Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
    KotlinRun.runNow(runnable)
}

fun runExample2() {
    KotlinRun.runNow { println("Passing a lambda as a Runnable") }
}