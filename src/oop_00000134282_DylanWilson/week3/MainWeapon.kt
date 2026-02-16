package oop_00000134282_DylanWilson.week3

fun main() {
    val weapon = Weapon("Excalibur", 600)

    weapon.damage = -50

    weapon.damage = 9999

    println("Tier weapon: ${weapon.tier}")
}
