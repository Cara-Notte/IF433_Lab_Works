package oop_00000134282_DylanWilson.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== TEST TYPE CONSTRAINTS ===")
    val mathBox = MathBox(10, 20)
    println("Hasil penjumlahan: ${mathBox.sum()}")

    val maxNumber = getMax(50, 75)
    val maxString = getMax("Ethereum", "Bitcoin")

    println("Angka terbesar: $maxNumber")
    println("String terbesar: $maxString")
}