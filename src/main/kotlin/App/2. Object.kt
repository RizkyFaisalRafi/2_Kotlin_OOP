package App

import dataClass.Person
// Dari 1 class bisa bikin lebih dari 1 object
fun main() {
    val rizky = Person()
    rizky.firstName = "Faisal"
    val Hendra = Person()
    Hendra.middleName = "Wibowo"
    val budi = Person()
    budi.lastname = "Rafi"

    println(rizky.firstName)
    println(Hendra.middleName)
    println(budi.lastname)

    /* Hasilnya seperti ini karena pada saat print sebuah object, si kotlin akan print object berupa lokasi di memorinya
       Bikin 3 Object Berbeda dari 1 class person
        dataClass.Person@3feba861
        dataClass.Person@5b480cf9
        dataClass.Person@6f496d9f
    */
}

