fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))

    // println(numbers[10])

    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())

    // sets index 0 to 10
    numbers.set(0, 10)
    println(numbers)
    // appends 1 to end
    numbers.add(1)
    println(numbers)
    // appends all numbers in other list
    val nums = listOf(3, 4)
    numbers.addAll(nums)
    println(numbers)
    // removes first instance of 10
    numbers.remove(10)
    println(numbers)
    // removes all instances of 3
    numbers.removeAll(listOf(3))
    println(numbers)
    // removes item at index 3
    numbers.removeAt(3)
    println(numbers)
    // clears list
    numbers.clear()
    println(numbers)
}