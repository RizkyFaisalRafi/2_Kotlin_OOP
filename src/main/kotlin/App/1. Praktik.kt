package App

import dataClass.Address

fun main() {
    val alamat = Address("Pondok Alam Permai","Kota Tangerang","Indonesia")

    println(alamat.street)
    println(alamat.city)
    println(alamat.country)
}
