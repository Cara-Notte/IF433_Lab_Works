package oop_00000134282_DylanWilson.week1

fun main() {
    val gameTitle = "Lobotomy Corporation"
    val price = 99000
    val discount = calculateDiscount(price)

    println("Judul: $gameTitle")
    println("Harga Asli: $price")
    println("Diskon: $discount")
    println("Harga Akhir: ${price - discount}")
}

fun calculateDiscount(price: Int): Int = when {
    price >= 500000 -> price * 60 / 100
    price >= 200000 -> price * 40 / 100
    price >= 75000 -> price * 20 / 100
    else -> 0
}