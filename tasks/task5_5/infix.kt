infix fun String.anagramOf(second: String): Boolean {
    if (this.length != second.length) return false
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    println("Enter a string: ")
    val string1 = readln()
    println("Enter another string: ")
    val string2 = readln()
    
    if (string2 anagramOf string1) {
        println("$string1 and $string2 are anagrams")
    }
    else {
        println("$string1 and $string2 are not anagrams")
    }
}