fun isEnglishVowel(c: Char) = c.lowercaseChar() in "aeiou"

fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main() {
    val test = "Hello World"

    val vowels = test.howMany(::isEnglishVowel)
    // or val vowels = test.howMany { isEnglishVowel(it) }
    println("Contains $vowels vowels")

    val consonants = test.howMany { !isEnglishVowel(it) }
    println("Contains $consonants consonants")

    val lettero = test.howMany { it == 'o' }
    println("Contains $lettero o's")

    val lower = test.howMany { it.isLowerCase() }
    println("Contains $lower lowercase letters")
}