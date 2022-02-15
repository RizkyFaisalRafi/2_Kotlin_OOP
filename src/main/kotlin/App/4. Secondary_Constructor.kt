package App

import dataClass.personSecondaryConstructor

fun main() {
    val name1 = personSecondaryConstructor("Rizky","Faisal","Rafi")
    val name2 = personSecondaryConstructor("Hendrawan", "Wibowo")

    // Menghasilkan Rizky Faisal Rafi
    println(name1.first)
    println(name1.middle)
    println(name1.last)
    // Menghasilkan Hendrawan Wibowo
    println(name2.first)
    println(name2.last)
}

