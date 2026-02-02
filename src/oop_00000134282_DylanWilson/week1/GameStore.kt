package oop_00000134282_DylanWilson.week1

fun main() {
    val gameTitle = "Lobotomy Corporation"
    val price = 99000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val note: String? = null
    printReceipt(finalPrice = finalPrice, title = gameTitle, note = note)
}

fun calculateDiscount(price: Int): Int = when {
    price >= 500000 -> price * 60 / 100
    price >= 200000 -> price * 40 / 100
    price >= 75000 -> price * 20 / 100
    else -> 0
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== RECEIPT ===")
    println("Judul : $title")
    println("Harga Akhir : $finalPrice")
    println("Catatan : ${note ?: "Tidak ada catatan"}")
}