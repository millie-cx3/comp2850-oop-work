// Task 12.5.4: class with a computed property

import java.time.LocalDate
import java.time.temporal.ChronoUnit.YEARS

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main() {
    val p = Person("Joe", LocalDate.of(1900, 7, 21))
    println(p.age)
}
