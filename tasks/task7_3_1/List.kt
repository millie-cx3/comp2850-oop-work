// Task 7.3.1: list element access
fun main() {
    val numbers2 = List<Float>(100) {0.0f}
    val greetings2 = List<String>(5) { "Hello" }

    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))

    // println(numbers[10])

    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    // numbers.set(0, 10)
    // numbers.add(1)
}