// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circleCircum(diameter: Double) = PI * diameter

fun readDouble(prompt: String): Double {
    println(prompt)
    val dble = readln().toDouble()
    return dble
} 

fun main() {
    println(circleArea(7.5))
    println(circleCircum(6.2))
    println(readDouble("Enter a double: "))
}