package oop_00000134282_DylanWilson.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter { item ->
            when (item) {
                is Coin -> item.name.contains(keyword, ignoreCase = true)
                else -> item.toString().contains(keyword, ignoreCase = true)
            }
        }
    }
}