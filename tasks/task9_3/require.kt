fun variance(dataset: List<Double>): Double {
    require(dataset.size > 1) { "not enough data" }

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}

fun main() {
    val list = listOf(1.25, 2.34, 5.67)
    println(variance(list))
}