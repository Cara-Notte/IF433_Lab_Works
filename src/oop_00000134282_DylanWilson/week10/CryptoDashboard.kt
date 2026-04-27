package oop_00000134282_DylanWilson.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 3.5))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
}