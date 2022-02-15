package App

import dataClass.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2015 // Bisa mengganti nilainya menjadi 2015

    val almaz = Car("Wuling", 2019) // Bisa mengganti nilainya menjadi 2019

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}

