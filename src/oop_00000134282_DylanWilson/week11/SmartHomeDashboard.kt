package oop_00000134282_DylanWilson.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acInverter = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }

    homeDevices.add(acInverter)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
}