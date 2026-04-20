package oop_00000134282_DylanWilson.week9

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 8.4, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 25, -12.7, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 12, 6.8, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 8, 0.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 10, 11.3, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}