package oop_00000134282_DylanWilson.week2

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

