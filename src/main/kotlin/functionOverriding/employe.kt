package functionOverriding
open class employe2(var name: String) {
    open fun sayHello(name: String): Unit{
        println("Hello $name, My name is ${this.name}")
    }

    open class Manager(name: String): employe2(name){
        final override fun sayHello(name: String) {
            println("Hello $name, My name is Manager ${this.name}")
        }
    }

    class superManager(name: String): Manager(name){ // Child dari Class Manager
    // ERROR Karena  function dari class manager di finalkan
//        override fun sayHello(name: String) {
//            println("Hello $name, My name is Super Manager ${this.name}")
//        }
    }

    class president(name: String): employe2(name){
        override fun sayHello(name: String) {
            println("Hello $name, My name is President ${this.name}")
        }
    }
}
