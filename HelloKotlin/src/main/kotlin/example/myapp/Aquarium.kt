package example.myapp

import java.lang.Math.PI

open class Aquarium(var width: Int = 20, open var height: Int = 20, var length: Int = 100) {

    open val shape = "rectangle"

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val water: Double
        get() = volume * 0.9

    init {
        println("Aquarium initializing.")
    }

    constructor(numberOfFish: Int) : this() {
        // 2000 cm^3 per fish + extra room so water doesn't spill.
        val tank = numberOfFish * 2000 * 1.1

        // Calculate the height needed.
        height = (tank / (length * width)).toInt()
    }

    fun printCharacteristics() {
        println(shape)
        println(
            "Width: $width cm. " +
                    "Height: $height cm. " +
                    "Length: $length cm."
        )
        println("Volume: $volume liters. Water: $water liters. ${water / volume * 100.0}% full.")
    }
}

class TowerTank(override var height: Int, var diameter: Int) :
    Aquarium(height = height, width = diameter, length = diameter) {

    override val shape = "cylinder"

    override var volume: Int
        // Ellipse area = PI * r1 * r2
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume * 0.8
}