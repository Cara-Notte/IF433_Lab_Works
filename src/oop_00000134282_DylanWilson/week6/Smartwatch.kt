package oop_00000134282_DylanWilson.week6

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layer OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}
