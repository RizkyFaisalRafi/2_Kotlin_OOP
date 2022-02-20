package Filekt

import superConstructor.ExecutiveCustomer
import superConstructor.PremiumCostomer

/*
* Kata kunci super tidak hanya untuk mengakses function dan properties
* di class Parent.
*
* Kata kunci super bisa juga digunakan untuk mengakses constructor
* di class Parent.
*
* Mengakses constructor class Parent hanya bisa dilakukan di dalam
* constructor di class Child.
*
* untuk mengakses constructor itu harus didalam constructor lagi.
*/

fun main() {
    println("Premium Customer")
    val premiumCust = PremiumCostomer("Faisal",)
    println(premiumCust.name)
    println(premiumCust.balance)

    println("\nExecutive Customer")
    val executivecust = ExecutiveCustomer("Rafi",10_000_000)
    println(executivecust.name)
    println(executivecust.balance)
}
