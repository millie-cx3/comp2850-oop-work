// Task 4.5: summing odd integers with a for loop
fun main () {
    print("Enter an integer limit: ")
    val limit = readln().toInt()
    var result: Long = 0

    for (n in 1..limit) {
        result = result + n
    }

    println(result)
}