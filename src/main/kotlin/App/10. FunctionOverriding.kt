package App

import functionOverriding.employe2

fun main() {
    val joko = employe2("Joko")
    joko.sayHello("Budi")

    val faisal = employe2.Manager("Faisal")
    faisal.sayHello("Mr Hendrawan")

    val hendrawan = employe2.president("Hendrawan")
    hendrawan.sayHello("Mr Faisal")
}

