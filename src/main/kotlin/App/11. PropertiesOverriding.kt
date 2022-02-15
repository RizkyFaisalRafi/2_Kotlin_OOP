package App

import propertiesOverriding.rectangle
import propertiesOverriding.shape
import propertiesOverriding.triangle

fun main() {
    val Shape = shape()
    println(Shape.corner)

    val Shape2 = rectangle()
    println(Shape2.corner)

    val Shape3 = triangle()
    println(Shape3.corner)
}
