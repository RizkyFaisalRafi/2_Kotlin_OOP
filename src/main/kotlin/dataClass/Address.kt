package dataClass

class Address (Paramstreet: String,
               Paramcity: String,
               Paramcountry: String) {

    init {
        println("Alamat Saya : ")
    }
    var street: String = Paramstreet
    var city: String = Paramcity
    var country: String = Paramcountry
}