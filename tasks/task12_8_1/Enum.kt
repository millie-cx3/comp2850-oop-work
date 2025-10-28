// Task 12.8.1: example of an enum class
enum class Day {
    Monday, Tuesday, Wednesday, Thursday,
    Friday, Saturday, Sunday
}

fun main() {
    print("Enter day: ")
    val choice = readln()
    var count = 0

    try {
        val day = Day.valueOf(choice)
        println("You chose: $day")
    }
    catch (e: IllegalArgumentException) {
        println("Input must be one of:")
        for (i in Day.values()) {
            if (count != 6) {
                print("$i, ")
                count += 1
            }
            else {
                print("$i \n")
            }
        }
    }
}