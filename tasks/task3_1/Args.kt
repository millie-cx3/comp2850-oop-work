// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: two arguments required")
        exitProcess(1)
    }
    else {
        println(args[0])
        println(args[1])
    }
}

// BEFORE adding argument number test:
// kotlin ArgsKt hello goodbye is same as kotlin "hello" "goodbye"
// works same with integers or mix of letters and integers
// error if none provided
// prints first arg then error if only one provided
// AFTER
// required error message if two arguments not provided