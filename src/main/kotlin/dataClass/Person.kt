package dataClass

// Function di dalam Class
class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastname: String = ""

    fun sayHello(name: String): Unit{ // Tidak mengembalikan apa apa
        println("Hi $name, Nama Aku $firstName")
    }


    fun getFullName():String{ // Return Value String
        return "$firstName $middleName $lastname"
    }
    fun sapa(firstName2: String,lastName2: String): Unit{ // Tidak mengembalikan apa apa
        println("Hi Bang $firstName2 $lastName2, Perkenalkan Nama Aku $firstName")
    }
}
