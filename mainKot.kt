fun main() {

    fun getUsername(): List<String> {
        val name = mutableListOf<String>()
        for (user in list) {
            name.add(user.name)
        }
        return name
    }


    fun getUsername(): List<String> {
        return list.map
    }
    println(getUsername())
}

/*
fun getFullName(
    first: String,
    middle: String,
    last: String): String {
    return "$first $middle $last"
}

 */

//NAMED ARGUMENT (DEFAULT ARGUMENT)

private fun main() {
    val fullName = getFullName(first = "Surey")
    println(fullName)
}

fun getFullName(
    first: String = "Kotlin",
    middle: String = " Ahmad ",
    last: String = "Jourge"): String {
    return "$first $middle $last"
}





//VARARG (VARIABLE ARGUMENT)--


fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

private fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)

    
}

