package example.myapp

abstract class AquariumFish: FishAction {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark: AquariumFish() {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish.")
    }
}

class Plecostomus: AquariumFish() {
    override val color = "gold"
    override fun eat() {
        println("Eat algae.")
    }
}