// Task 5.3.2: dice rolling simulation

import kotlin.random.Random

fun rollDice(sides: Int = 6, numDice: Int = 2) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling $numDice d${sides}s...")
        var total = 0
        for (i in 1..numDice) {
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
            total = total + result
        }
        println("You rolled a total of $total")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main() {
    rollDice(8, 2)
    rollDice(numDice = 3, sides = 12)
    rollDice()
}
