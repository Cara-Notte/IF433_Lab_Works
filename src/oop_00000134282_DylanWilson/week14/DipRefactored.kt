package oop_00000134282_DylanWilson.week14


interface Database {
    fun query(sql: String): List<String>
}

class PostgreDatabase : Database {
    override fun query(sql: String): List<String> {
        return listOf("pg_data1", "pg_data2")
    }
}