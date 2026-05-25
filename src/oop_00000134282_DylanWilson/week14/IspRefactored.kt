package oop_00000134282_DylanWilson.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

interface Faxable {
    fun fax(doc: String)
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) {
        println("Printing securely: $doc")
    }
}