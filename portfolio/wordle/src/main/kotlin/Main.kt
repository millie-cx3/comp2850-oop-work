fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)

    println("\n---WORDLE---\n")

    var won = false
    for (attempt in 1..6) {
        val guess = obtainGuess(attempt)
        val evaluate = evaluateGuess(guess, target)
        displayGuess(guess, evaluate)

        if (evaluate.all { it == 2 }) {
            println("You win!")
            won = true
            break
        }
    }

    if (won == false) {
        println("You lose! The word was $target")
    }
}
