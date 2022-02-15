package App

import dataClass.Person
// Function didalam Class
fun main() {
    val joko = Person()
    joko.firstName  = "Joko"
    joko.middleName = "Tingkir"
    joko.lastname   = "Mundia"
    joko.sayHello("Faisal") // Cara mengeksekusi :Unit
    println(joko.getFullName()) // Cara mengeksekusi Return Value

    val hendra = Person()
    hendra.firstName  = "Faisal"
    hendra.sapa("Hendrawan","Wibowo") // Cara mengeksekusi :Unit
}
