// Task 12.5.1: investigating the nature of properties

import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
}

fun main() {
    val p = Person("Joe", birth=LocalDate.of(1992, 8, 23))
    println(p.name)
    p.name = "David"
    println(p.name)
}