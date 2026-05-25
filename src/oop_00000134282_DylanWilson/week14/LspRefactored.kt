package oop_00000134282_DylanWilson.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(
    var width: Int,
    var height: Int
) : Shape {
    override fun area(): Int = width * height
}

class SafeSquare(
    var side: Int
) : Shape {
    override fun area(): Int = side * side
}