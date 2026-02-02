package oop_00000134282_DylanWilson.week1

fun main() {
    val name : String = "Dylan Wilson"
    val score: Int = 97

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Nama: $name, Nilai: $score")
    println("Grade kamu: $grade")
}