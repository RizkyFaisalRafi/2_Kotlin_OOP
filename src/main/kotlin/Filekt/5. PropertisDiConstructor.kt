package Filekt
import propertisDiConstructor.User
fun main() {

    val hendra = User("hendrawan123", "rahasia123") // Properties Constructor
    val faisal = User(username = "RIFARA123", password = "30Faisal123")

    println(hendra.username) // Properties Constructor
    println(hendra.password)

    println(faisal.username)
    println(faisal.password)
}
