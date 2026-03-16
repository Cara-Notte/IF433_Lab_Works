package oop_00000134282_DylanWilson.week7

fun main () {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when (response) {
        ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Tampilkan: ${response.message}"
    }


    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    println()

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata awal pemain:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")


    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println()
    println("Senjata setelah di-upgrade oleh Blacksmith:")
    println("Nama: ${upgradedItem.name}")
    println("Damage: ${upgradedItem.damage}")
    println("Rarity: ${upgradedItem.rarity}")

    println()
    println("=== Simulasi Event Pertarungan ===")

// 1. Safe Zone
    processEvent(BattleState.SafeZone)

// 2. Monster Encounter
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

// 3. Loot Drop (menggunakan item hasil copy)
    processEvent(BattleState.LootDropped(upgradedItem))

// 4. Game Over
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}