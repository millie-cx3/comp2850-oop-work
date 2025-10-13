// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    "False if strings are different lengths" {
        withClue("hello vs goodbye") { "hello" anagramOf "goodbye" shouldBe false }
        withClue("hello vs hello") { "hello" anagramOf "helllo" shouldBe false }
    }
    "False if either string empty" {
        withClue("empty vs non-empty") { "" anagramOf "a" shouldBe false }
        withClue("non-empty vs empty") { "a" anagramOf "" shouldBe false }
        withClue("empty vs empty") { "" anagramOf "" shouldBe false }
    }
    "True if strings are anagrams" {
        withClue("hello vs olleh") { "hello" anagramOf "olleh" shouldBe true }
        withClue("listen vs silent") { "listen" anagramOf "silent" shouldBe true }
    }
    "False if strings are not anagrams" {
        withClue("holp vs help") { "holp" anagramOf "help" shouldBe false }
        withClue("hello vs world") { "hello" anagramOf "world" shouldBe false }
    }
    "True if strings are anagrams, regardless of case" {
        withClue("HellO vs oLLeh") { "HellO" anagramOf "oLLeh" shouldBe true }
        withClue("LISTEN vs silent") { "LISTEN" anagramOf "silent" shouldBe true }
    }
})
