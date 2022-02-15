package dataClass

class personSecondaryConstructor(firstName:String, // Primary Constructor
                                 middleName: String?,
                                 lastName: String) {
    // Secondary Constructor
    constructor(firstName: String,lastName: String): this(firstName,null,lastName){
        println("Secondary Constructor")
    }

    val first = firstName
    val middle = middleName
    val last = lastName
}

