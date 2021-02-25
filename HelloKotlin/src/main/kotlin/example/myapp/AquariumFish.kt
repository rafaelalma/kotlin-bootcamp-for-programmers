package example.myapp

interface FishAction {
    fun eat()
}

class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }

}

interface FishColor {
    val color: String
}

// Singleton
object GoldColor : FishColor {
    override val color = "gold"
}

class Shark : FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish.")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor, fishAction: FishAction = PrintingFishAction("algae")) :
        FishAction by fishAction, FishColor by fishColor