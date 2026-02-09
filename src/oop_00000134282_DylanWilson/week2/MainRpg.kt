package oop_00000134282_DylanWilson.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan damage Hero: ")
    var heroDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage = heroDamage)

    var enemyHp = 100

    println("\n=== BATTLE START ===")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP ${hero.heroName}: ${hero.hp}")
        println("HP Musuh: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh menyerang balik! Damage: $enemyDamage")
                    hero.takeDamage(enemyDamage)
                    println("HP ${hero.heroName} tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("${hero.heroName} kabur dari pertarungan!")
                break
            }

            else -> {
                println("Pilihan tidak valid. Giliran hangus.")
            }
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.heroName} MENANG dengan sisa hp ${hero.hp}!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Musuh MENANG dengan sisa hp ${enemyHp}!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
