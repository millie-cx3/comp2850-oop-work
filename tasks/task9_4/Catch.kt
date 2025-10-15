// Task 9.4: use of catch blocks

fun main() {
    try {
        print("Enter numerator: ")
        val numerator = readln().toInt()
        print("Enter denominator: ")
        val denominator = readln().toInt()

        val result = numerator / denominator
        val remainder = numerator % denominator
        println("Result = $result remainder $remainder")
    }
    // e.g. if you entered a string
    catch (error: NumberFormatException) {
        println("You didn't enter a valid number")
    }
    // e.g. if you had a require statement and input didn't meet it
    catch (error: IllegalArgumentException) {
        println("Illegal argument")
    }
    // catches any other errors
    catch (error: Exception) {
        println("Some sort of error occurred")
    }
    // would catch /0 if general error thing wasn't above it
    catch (error: ArithmeticException) {
        println("You tried to divide by zero")
    }
}
