fun main() {
    val numbers = intArrayOf(9, 6, 3, 2)
    
    val numbers2 = mutableListOf(9, 3, 6, 2, 8, 5)
    
    val names = mutableSetOf("Joe", "Sarah", "Nicole")

    val prices = mutableMapOf(
        "Apple" to 32,
        "Orange" to 55,
        "Kiwi" to 20
    )

    if (6 in numbers) {
        println("Contains 6")
    }

    if ("Apple" in prices.keys) {
        println("Apples")
    }

    if (20 in prices.values) {
        println("20p")
    }

    if (prices.containsKey("Orange") && prices.containsValue(55)) {
        println("Oranges 55p")
    }

    if (numbers2.containsAll(setOf(3, 8, 9))) {
        println("3, 8, 9")
    }

    for (item in names) {
        println("hello $item")
    }

    for (key in prices.keys) {
        println(key)
    }

    numbers.forEach(::println)
}