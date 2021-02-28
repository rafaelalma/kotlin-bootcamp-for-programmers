package example.myapp

fun main() {
    buildAquarium()

    makeFish()

    println(matchSeal(SeaLion))
}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${plecostomus.color}")
    plecostomus.eat()
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

    val aquarium6 = Aquarium(length = 25, height = 40, width = 25)
    aquarium6.printCharacteristics()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printCharacteristics()
}