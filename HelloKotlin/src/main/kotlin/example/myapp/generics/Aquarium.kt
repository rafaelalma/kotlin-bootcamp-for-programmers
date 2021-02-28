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

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("Water added")
    }
}

inline fun <reified R : WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

inline fun <reified T : WaterSupply> WaterSupply.isOfType() = this is T

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("Aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

fun main() {
    genericsExample()
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}