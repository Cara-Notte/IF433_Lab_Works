package oop_00000134282_DylanWilson.week4

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}
