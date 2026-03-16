package oop_00000134282_DylanWilson.week7

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient denganBASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}