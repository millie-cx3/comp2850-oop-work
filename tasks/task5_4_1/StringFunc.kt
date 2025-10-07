// Task 5.4.1: string extension function

fun main() {
    val String.tooLong: Boolean get() = this.length() > 20
    val string = "this string is way way too long"
    println(string.toolong)
}
