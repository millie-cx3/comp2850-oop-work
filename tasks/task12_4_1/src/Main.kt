// Task 12.4.1: main program

fun main() {
    val centre = Point(0.0, 0.0)
    val circle = Circle(centre, 5.0)
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    val point1 = Point(2.0, 3.0)
    val point2 = Point(6.0, 7.0)

    println("Point (2.0, 3.0) in circle? : ${circle contains point1}")
    println("Point (6.0, 7.0) in circle? : ${circle contains point2}")
}
