package functionOverloading

class PersonOverloading(val name: String) {

    fun sayHello(firstName: String):Unit{
        println("Hello $firstName, My Name Is $name")
    }

    fun sayHello(firstName: String, lastName: String):Unit{
        println("Hello $firstName $lastName, My Name Is $name")
    }
}
