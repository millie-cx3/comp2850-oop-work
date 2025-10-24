// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(birth: String): this(birth.toLocalDate())
    var isMarried = false
}

fun main() {
    
}
