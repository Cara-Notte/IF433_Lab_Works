package oop_00000134282_DylanWilson.week9

fun main() {
    println("=== TEST LAMBDA ===")

    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}