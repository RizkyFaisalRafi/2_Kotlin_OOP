package inheritance

open class employe(val name: String) { // Class Parent

    fun sayHello(name: String){
        println("Hello $name, My name is ${this.name}")
    }
}
    // Class Child
    // Parameter inheritance harus sesuai dengan parameter parentnya
    final class Manager(name: String): employe(name)
    final class president(name: String): employe(name)

