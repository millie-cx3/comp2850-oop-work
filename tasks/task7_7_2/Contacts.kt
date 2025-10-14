// Task 7.7.2: contact database, using a map
fun main() {
    val contacts = mutableMapOf(
        "Bob" to "07723987456",
        "Steve" to "07723289012",
        "Jerry" to "07790327655"
    )

    println("Enter contact name: ")
    val new = readln()

    if (new in contacts.keys) {
        val number = contacts[new]
        println("Phone number: $number")
    }
    else {
        println("Enter phone number: ")
        val newNumber = readln()
        contacts[new] =  newNumber
    }

    println(contacts)
}