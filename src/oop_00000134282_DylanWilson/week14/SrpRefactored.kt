package oop_00000134282_DylanWilson.week14

class UserValidator {
    fun validate(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }
}

class UserRepository {
    fun save(user: User) {
        println("Saving user ${user.name} to database")
    }
}