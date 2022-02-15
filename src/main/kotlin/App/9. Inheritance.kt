package App

import inheritance.Manager
import inheritance.employe
import inheritance.president

fun main() {
    val Faisal = employe("Faisal")
    Faisal.sayHello("Budi")

    val hendrawan = Manager("hendrawan")
    hendrawan.sayHello("Joko")

    val Irwan = president("Irwan")
    Irwan.sayHello("Acla")
}



