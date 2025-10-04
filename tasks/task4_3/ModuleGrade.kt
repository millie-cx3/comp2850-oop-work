import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: three arguments required")
        exitProcess(1)
    }
    else {
        val marks = args.map { it.toInt() }
        val average = marks.average().roundToInt()
        val grade = when (average) {
            in 0..39 -> "Fail"
            in 40..69 -> "Pass"
            in 70..100 -> "Distinction"
            else -> "?"
        }
        println(grade)
    }
}