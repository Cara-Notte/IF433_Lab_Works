package oop_00000134282_DylanWilson.week5

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        pegawai.bekerja()
        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    // task 1
    val math = MathHelper()

    println(math.hitungLuas(4))        // persegi
    println(math.hitungLuas(6, 3))     // persegi panjang
    println(math.hitungLuas(7.0))      // lingkaran

    // task 2
    val eWallet = EWallet(
        accountName = "Dylan",
        balance = 50000.0
    )

    val creditCard = CreditCard(
        accountName = "Dylan",
        limit = 100000.0
    )

    val paymentMethods: List<PaymentMethod> = listOf(
        eWallet,
        creditCard
    )

    for (method in paymentMethods) {
        method.processPayment(75000.0)
    }
}