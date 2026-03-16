package oop_00000134282_DylanWilson.week3

fun main(){
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")


    // main player
    val player = Player("Cara")
    player.addXp(50)
    player.addXp(60)
    println("Level saat ini: ${player.level}")


    // main weapon
    val weapon = Weapon("Excalibur", 600)
    weapon.damage = -50
    weapon.damage = 9999
    println("Tier weapon: ${weapon.tier}")
}