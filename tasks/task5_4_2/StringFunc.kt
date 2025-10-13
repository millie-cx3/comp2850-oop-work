val String.tooLong: Boolean get() = this.length > 20


fun main() {
    println("Enter a string: ")
    val string = readln()
    println(string.tooLong)
}