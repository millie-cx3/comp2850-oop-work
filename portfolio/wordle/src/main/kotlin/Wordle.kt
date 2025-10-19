// Implement the six required functions here
import java.io.File

fun isValid(word: String): Boolean {
    if (word.length != 5) {
        return false
    }
    else {
        return true
    }
}

fun readWordList(filename: String): MutableList<String> {
    return File(filename).readLines().toMutableList()
}

fun pickRandomWord(words: MutableList<String>): String {
    val chosen = words.random()
    words.remove(chosen)
    return chosen
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        println("Attempt $attempt: ")
        val guess = readln()

        if (guess.length != 5 || guess != guess.uppercase()){
            println("Guess must be 5 letters and capitalised. Please try again\n")
        }
        else {
            return guess
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = MutableList(5) { 0 }
    val used = MutableList(5) { false }

    for (i in 0..(guess.length-1)) {
        if (guess[i] == target[i]) {
            result[i] = 2
            used[i] = true
        }
    }

    for (i in 0..(guess.length-1)) {
        if (result[i] == 0) {
            for (j in 0..(target.length-1)) {
                if (!used[j] && guess[i] == target[j]) {
                    result[i] = 1
                    used[j] = true
                    break
                }
            }
        }
    }

    return result
}


fun displayGuess(guess: String, matches: List<Int>) {
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val reset = "\u001B[0m"
    for (i in 0..guess.length-1) {
        when (matches[i]) {
            2 -> print("${green}${guess[i]}${reset}")
            1 -> print("${yellow}${guess[i]}${reset}")
            0 -> print("${guess[i]}")
        }
    }
    print("\n")
}