@file:Suppress("unused", "SpellCheckingInspection")

package oop_00000134282_DylanWilson.week14

import java.io.File
import java.io.FileWriter

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
        FileWriter(File(fileName), true).buffered().use { writer ->
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

interface PricingStrategy {
    fun calculate(price: Double): Double
    fun customerType(): String
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price

    override fun customerType(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90

    override fun customerType(): String = "VIP"
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        val order = Order(
            itemName = itemName,
            finalPrice = finalPrice,
            customerType = pricingStrategy.customerType()
        )

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(order)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi")
    }
}

fun main() {
    val repository: OrderRepository = CsvOrderRepository()
    val notifier: NotificationService = EmailNotifier()

    val processor = SafeOrderProcessor(repository, notifier)

    processor.processOrder(
        itemName = "Keyboard Mechanical",
        basePrice = 500000.0,
        pricingStrategy = RegularPricing()
    )

    processor.processOrder(
        itemName = "Mouse Wireless",
        basePrice = 250000.0,
        pricingStrategy = VipPricing()
    )
}