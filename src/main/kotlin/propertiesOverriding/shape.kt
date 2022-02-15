package propertiesOverriding

open class shape {
    open val corner: Int = 10
}

class rectangle : shape(){
    override val corner = 20
}

class triangle: shape(){
    override val corner = 30
}
