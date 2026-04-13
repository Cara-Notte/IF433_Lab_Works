package oop_00000134282_DylanWilson.week8

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            parser.parseProduct(raw)?.let { product ->
                when (product) {
                    is Electronic -> {
                        println("Electronic Product Parsed:")
                        println("ID: ${product.id}, Name: ${product.name}, Warranty: ${product.warrantyMonths}")
                    }

                    is Clothing -> {
                        println("Clothing Product Parsed:")
                        println("ID: ${product.id}, Name: ${product.name}, Size: ${product.size}")
                    }
                }

                parser.checkout(product)
                println("-----")
            }
        } catch (e: IllegalArgumentException) {
            println("Warning: ${e.message}")
            println("-----")
        }
    }
}