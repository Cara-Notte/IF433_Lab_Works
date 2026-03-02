package oop_00000134282_DylanWilson.week5

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merivisi RPKPS.")
    }
    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}