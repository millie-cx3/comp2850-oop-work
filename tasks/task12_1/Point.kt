import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = hypot(x - p.x, y - p.y)

}

fun main() {
    print("Enter x coordinate: ")
    val x = readln().toDouble()
    print("Enter y coordinate: ")
    val y = readln().toDouble()

    val p = Point(x, y)
    val p2 = Point(4.5, 7.0)
    println(p.distance())
    println(p.distanceTo(p2))
}