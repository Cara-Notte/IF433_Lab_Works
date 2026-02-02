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

    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Nama: $name, Nilai: $score")
    println("Panjang ID: $idLength")
    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"