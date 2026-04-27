package oop_00000134282_DylanWilson.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 3.5))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status response: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    println("\n=== SEARCH COIN ===")
    val searchResult = coinRepo.searchByName("BT")
    searchResult.forEach { coin ->
        println("Found: $coin")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250.0))
    txRepo.add(Transaction("TX002", 500.0))
    txRepo.add(Transaction("TX003", 125.5))

    println("\n=== TRANSACTION DATA ===")
    txRepo.getAll().forEach { tx ->
        println("Transaction ID: ${tx.id}, Amount: ${tx.amount}")
    }
}