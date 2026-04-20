package oop_00000134282_DylanWilson.week9

fun main() {
    println("=== TEST LIST ===")

    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")

    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}