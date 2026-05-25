package oop_00000134282_DylanWilson.week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.80
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.85
}

class SafeDiscountCalculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double): Double = strategy.apply(price)
}

class SeniorDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.75
}