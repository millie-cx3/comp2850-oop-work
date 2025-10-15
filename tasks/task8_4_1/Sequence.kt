// Task 8.4.1: experimenting with sequences

fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)

    // prints list
    // val result = numbers

    // prints some long jargony thing
    // val result = numbers.asSequence()

    // prints some shorter jargony thing with 'filtering' in there
    // val result = numbers.asSequence().filter { it % 2 != 0 }

    // prints odd numbers
    val result = numbers.asSequence().filter { it % 2 != 0 }.toList()

    println(result)
}
