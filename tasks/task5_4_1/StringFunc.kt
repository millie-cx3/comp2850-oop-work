// Task 5.4.1: string extension function

fun String.tooLong(): Boolean {
    return this.length > 20
}

fun main() {
    println("Enter a string: ")
    val string = readln()
    println(string.tooLong())
}
