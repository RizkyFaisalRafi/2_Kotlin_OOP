package App

import superKeyword.rectangle
import superKeyword.shape
import superKeyword.triangle

fun main() {
    val shape1 = shape()
    println(shape1.corner)

    val shape2 = rectangle()
    println(shape2.corner)
    // Mengakses Super Function
    shape2.printName()

    val shape3 = triangle()
    println(shape3.corner)
    // Mengakses Super keywords
    println(shape3.parentCorner)
}
