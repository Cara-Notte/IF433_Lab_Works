package oop_00000134282_DylanWilson.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        // split delimiter
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

// save trades
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

// load trades
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { line ->
            fromCsvTrade(line)
        }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
    // try catch
}

// main
fun main() {
    val simulatedTrades = listOf(
        TradeRecord(
            id = 1,
            symbol = "BTCUSDT",
            type = "Long",
            margin = 1000.0,
            pnl = 125.50
        ),
        TradeRecord(
            id = 2,
            symbol = "ETHUSDT",
            type = "Short",
            margin = 750.0,
            pnl = -45.25
        ),
        TradeRecord(
            id = 3,
            symbol = "SOLUSDT",
            type = "Long",
            margin = 500.0,
            pnl = 80.75
        )
    )

    saveTrades(simulatedTrades, path = "crypto_trades.csv")

    // corrupt
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    // save laoded data
    val loadedData = loadTrades(path = "crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    // final test
    println("==== VALID TRADE ENTRIES ====")
    loadedData.forEach { trade ->
        println(trade)
    }

    println("==== TOTAL PnL BERSIH: $totalPnl ====")
    fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"
}