package oop_00000134282_DylanWilson.week7

fun processEvent(event: BattleState) {

    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung.")
        }

        is BattleState.LootDropped -> {
            val item = event.item
            println("Loot ditemukan: ${item.name}")
            println("Rarity: ${item.rarity}")
        }

        is BattleState.GameOver -> {
            println("GAME OVER! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. Tidak ada musuh di sekitar.")
        }
    }

}