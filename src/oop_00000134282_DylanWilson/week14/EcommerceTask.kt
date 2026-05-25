package oop_00000134282_DylanWilson.week14

import java.io.File

data class Order(
    val itemName: String,
    val finalPrice: Double,
    val customerType: String
)

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName,$finalPrice,$customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi")
    }
}

interface OrderRepository {
    fun saveOrder(order: Order)
}

class CsvOrderRepository(
    private val fileName: String = "orders.csv"
) : OrderRepository {
    override fun saveOrder(order: Order) {
        File(fileName).bufferedWriter(Charsets.UTF_8, append = true).use { writer ->
            writer.write("${order.itemName},${order.finalPrice},${order.customerType}")
            writer.newLine()
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        val order = Order(itemName, finalPrice, customerType)

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(order)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi")
    }
}