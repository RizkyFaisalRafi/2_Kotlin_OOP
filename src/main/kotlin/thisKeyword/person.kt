package thisKeyword

class person(val name: String){

    fun sayHello(name: String): Unit {
        println("HI $name, My name is ${this.name}")
    }
}

