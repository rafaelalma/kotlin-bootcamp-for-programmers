package example.myapp.generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "Water supply needs processing first" }
        println("Adding water from $waterSupply")
    }
}

fun main() {
    genericsExample()
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()
    aquarium2.addWater()
}