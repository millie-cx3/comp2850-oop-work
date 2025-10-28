// Task 12.3.3: Initialiser blocks
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}

fun main() {
    println("Enter name: ")
    val name = readln()
    println("Enter DoB: ")
    val dob = readln()
    val person = Person(name, dob)
    println("Name: ${person.name}")
    println("Birth: ${person.birth}")
    println("Married: ${person.isMarried}")

}
