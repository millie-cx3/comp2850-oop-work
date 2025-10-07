// Task 5.1.1: anagram checking using a function

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    println("Enter a string: ")
    val string1 = readln()
    println("Enter another string: ")
    val string2 = readln()
    println(anagrams(string1,string2))
}