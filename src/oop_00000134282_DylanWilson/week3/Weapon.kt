package oop_00000134282_DylanWilson.week3

class Weapon(val name: String, damageInput: Int) {

    var damage: Int = damageInput
        set(value) {
            when {
                value < 0 -> {
                    println("Warning: Damage tidak boleh negatif. Nilai tidak diubah.")
                    // field tetap nilai lama
                }
                value > 1000 -> {
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
