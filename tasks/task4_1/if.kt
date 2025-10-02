fun main () {
    println("Enter a number: ")
    val number = readln().toInt()

    println("Enter another number: ")
    val number2 = readln().toInt()

    if (number < 0 || number > 100) {
        println("Number out of range")
    }

    else {
        println("Number OK")
    }

    // HAS to have an else branch for message to potentially be assigned by
    // UNLESS not using result of expression in some way
    val message = if (number2 < 0) {
        "Number too low"
    }

    else if (number2 > 100) {
        "Number too high"
    }

    else {
        "Number OK"
    }

    println(message)

    // can do in one line
    val sign = if (number < 0 )'-' else '+'
    println(sign)
}