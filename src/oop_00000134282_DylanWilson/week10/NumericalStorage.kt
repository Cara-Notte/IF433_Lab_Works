package oop_00000134282_DylanWilson.week10

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

fun <T> getMax(first: T, second: T): T where T : Comparable<T> {
    return if (first > second) first else second
}