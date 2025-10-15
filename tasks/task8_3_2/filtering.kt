fun main() {
    val words = listOf("Hello", "Hi", "Goodbye", "Bye")
    val short = words.filter { it.length < 5 }
    println(short)

    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)
    val sqaures = numbers.map { it * it }
    val oddSqaure = numbers.filter { it % 2 != 0 }.map { it * it }
    println(sqaures)
    println(oddSqaure)
}