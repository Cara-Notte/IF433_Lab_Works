package oop_00000134282_DylanWilson.week1

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    checkSize(area)
}

fun checkSize(area: Double) = if (area > 100) println("This is a Big Circle") else println("This is a Small Circle")