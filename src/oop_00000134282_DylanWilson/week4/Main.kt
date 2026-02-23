package oop_00000134282_DylanWilson.week4

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car---")
    val MyTesla = ElectricCar("Tesla", 4, 100)
    MyTesla.accelerate()
    MyTesla.honk()
    MyTesla.openTrunk()

    val manager = Manager(
        name = "Andy",
        baseSalary = 10000000
    )

    val developer = Developer(
        name = "Bob",
        baseSalary = 8000000,
        programmingLanguage = "Kotlin"
    )

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")

}