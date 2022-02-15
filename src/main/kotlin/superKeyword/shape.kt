package superKeyword

open class shape{
    open val corner = 10
    open fun printName(): Unit{
        println("This is Super Function")
    }
}

class rectangle: shape(){
    override val corner = 20
    override fun printName(){
        super.printName() // Super Function
    }
}

class triangle: shape(){
    override val corner = 30
    // Mengambil corner yang ada di shape/parent dari triangle
    val parentCorner = super.corner // Super Properties
}
