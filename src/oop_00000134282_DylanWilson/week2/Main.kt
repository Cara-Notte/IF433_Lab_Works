package oop_00000134282_DylanWilson.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    // library
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("\n=== Detail Peminjaman ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")


    // rpg
    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan damage Hero: ")
    var heroDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage = heroDamage)

    var enemyHp = 100

    println("\n=== BATTLE START ===")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP ${hero.heroName}: ${hero.hp}")
        println("HP Musuh: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh menyerang balik! Damage: $enemyDamage")
                    hero.takeDamage(enemyDamage)
                    println("HP ${hero.heroName} tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("${hero.heroName} kabur dari pertarungan!")
                break
            }

            else -> {
                println("Pilihan tidak valid. Giliran hangus.")
            }
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.heroName} MENANG dengan sisa hp ${hero.hp}!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Musuh MENANG dengan sisa hp ${enemyHp}!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
