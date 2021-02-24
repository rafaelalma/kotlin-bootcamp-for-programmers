package example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {

    // Default
    val aquarium1 = Aquarium()
    aquarium1.printCharacteristics()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printCharacteristics()

    val aquarium3 = Aquarium(width = 25, height = 30)
    aquarium3.printCharacteristics()

    val aquarium4 = Aquarium(width = 25, height = 30, length = 40)
    aquarium4.printCharacteristics()

    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printCharacteristics()
    aquarium5.volume = 70
    aquarium5.printCharacteristics()
}
