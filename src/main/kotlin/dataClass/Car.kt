package dataClass

class Car (paramBrand: String,
           paramYear: Int = 2022){ // Bisa memasukan default value juga optional


    var brand: String = paramBrand
    var year: Int = paramYear
}