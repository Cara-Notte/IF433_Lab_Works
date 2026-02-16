package oop_00000134282_DylanWilson.week3

class Employee(val name: String) {
    var salary: Int = 0
    private var performanceRating: Int = 3

    set(value) {
        if (value < 0) {
            println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
            field = 0
        } else {
            field = value
        }
    }

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}