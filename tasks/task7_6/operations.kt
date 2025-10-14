fun main() {
    val words = listOf("Apple", "Orange", "Apple", "Kiwi")

    println(words.size)
    println(words.isEmpty())
    println(words.lastIndexOf("Apple")) // last index or -1 if not there
    println(words.indexOf("Banana")) // first index or -1 if not there

    val numbers = mutableListOf(9, 3, 6, 2, 8, 5, 1)
    println(numbers.min())
    println(numbers.max())
    println(numbers.sum())
    println(numbers.average())

    val chunks = numbers.chunked(3)
    println(chunks) // prints in groups of 3, last item just in own list bc 7 items

    println(numbers.distinct()) // doesn't print duplicates
    val list2 = words.shuffled()
    println(list2)
}