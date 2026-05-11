package oop_00000134282_DylanWilson.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== Jadwal Makan 1: Pagi ===")

    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )

        println("Makan pagi sukses! Sisa stok kibble: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("Peringatan ke Pemilik: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan ke Pemilik: ${e.message}")
    } catch (e: Exception) {
        println("Peringatan umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}