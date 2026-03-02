package oop_00000134282_DylanWilson.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
