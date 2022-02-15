package superConstructor

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name,type,1) // Ini akses constructor ke-1/primary constructor
    constructor(name: String) : this(name,"Standard") // Ini akses constructor ke-2
}

// Mengakses constructor di kelas parent
class PremiumCostomer : Customer{
    constructor(name: String) : super(name, "Premium") // Ini akses constructor ke-2
    constructor(name: String, balance: Long) : super(name, "Premium", balance) // Ini akses constructor ke-1
}

class ExecutiveCustomer(name: String, balance: Long) : Customer(name,"Executive",balance) {
    constructor(name: String) : this(name,0)
}