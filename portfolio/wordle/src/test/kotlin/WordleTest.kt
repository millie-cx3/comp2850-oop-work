import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.matchers.shouldBe
import java.io.File

@Suppress("unused")
class WordleTest : StringSpec({
    "isValid returns true if word consists of exactly 5 letters" {
        withClue("Word=HELLO") { isValid("HELLO") shouldBe true }
        withClue("Word=WORLD") { isValid("WORLD") shouldBe true }
    }

    "isValid returns false if word doesn't consist of exactly 5 letters" {
        withClue("Word=HELL") { isValid("HELL") shouldBe false }
        withClue("Word=WORLDY") { isValid("WORLDY") shouldBe false }
    }

    "readWordList reads words from test file and returns them as a list of strings" {
        val testFile = File("testWords.txt")
        testFile.writeText("HELLO\nTHERE\nWORLD")
        readWordList(testFile.absolutePath) shouldBe mutableListOf("HELLO", "THERE", "WORLD")
    }

    "pickRandomWord chooses random word and removes it from list" {
        val words = mutableListOf("HELLO", "THERE", "WORLD")
        val chosen = pickRandomWord(words)
        chosen shouldBeIn listOf("HELLO", "THERE", "WORLD")
        words shouldNotContain chosen
    }

    "evaluateGuess compares two words and evaluates whether they match" {
        withClue("HELLO VS WORLD") { evaluateGuess("HELLO", "WORLD") shouldBe listOf(0, 0, 0, 2, 1) }
        withClue("DLROW VS WORLD") { evaluateGuess("DRLOW", "WORLD") shouldBe listOf(1, 1, 1, 1, 1) }
        withClue("WORLD VS WORLD") { evaluateGuess("WORLD", "WORLD") shouldBe listOf(2, 2, 2, 2, 2) }
        withClue("LOWLY VS JELLY") { evaluateGuess("LOWLY", "JELLY") shouldBe listOf(1, 0, 0, 2, 2) }
    }
})
