// Task 7.7.1: stats for a numeric dataset

fun readData(): List<Double> {
    var stop = false
    val data = buildList {
        while (stop == false) {
            println("Enter a number or 'done': ")
            val answer = readln()
            if (answer == "done") {
                stop = true
            }
            else {
                add(answer.toDouble())
            }
        }
    }
    // print("Average = ${data.average()}\n")
    return data
}

fun average(list: List<Double>) {
    val data = list
    print("Average = ${data.average()}\n")
}

fun median(list: List<Double>) {
    val sorted = list.sorted()
    val size = sorted.size

    if (size % 2 == 1) {
        println("Median = ${sorted[size/2]}")
    }
    else {
        val num1 = sorted[size/2-1]
        val num2 = sorted[size/2]
        println("Median = ${(num1+num2)/2}")
    }
}

fun main() {
    val list = readData()
    average(list)
    median(list)
    println("Min: ${list.min()}")
    println("Max: ${list.max()}")
}
