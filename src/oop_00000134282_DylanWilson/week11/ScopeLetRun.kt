package oop_00000134282_DylanWilson.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val nameLength = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }

    println("Panjang nama: $nameLength")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: $this")
        this.length * 2
    }

    println("Hasil kalkulasi run: $result")
}