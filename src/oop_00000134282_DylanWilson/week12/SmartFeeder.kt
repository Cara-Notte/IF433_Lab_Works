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

    return availableGram - requestedGram
}