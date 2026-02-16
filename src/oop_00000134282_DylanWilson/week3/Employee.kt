package oop_00000134282_DylanWilson.week3

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        println("Mencoba set gaji ke: $value")
        this.salary = value
    }
}