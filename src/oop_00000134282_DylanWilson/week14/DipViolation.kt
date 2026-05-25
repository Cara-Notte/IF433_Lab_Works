package oop_00000134282_DylanWilson.week14

class MySQLDatabase {
    fun query(sql: String): List<String> {
        return listOf("data1", "data2")
    }
}

class UserService {
    private val database = MySQLDatabase() // hard-coded, tightly coupled

    fun getUser(id: Int): List<String> {
        return database.query("SELECT * FROM users WHERE id=$id")
    }
}