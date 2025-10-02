fun main () {
    print("Enter your name: ")
    val name = readln()

    // string interpolation and formatting
    println("Hello $name!")
    println("Your name has ${name.length} letters")
    println("Is it a short name? ${name.length < 5}")
    println("Uppercase name: ${name.uppercase()}")

    // method 1 for formatting interpolated floats
    val radius = 5
    val area = 3.14 * radius * radius
    println("Area = %.2f cm".format(area))

    val r = 200
    val g = 450
    val b = 670

    // method 2 for formatting interpolated floats
    with(System.out) {
        printf("Circle colour = (%d,%d,%d)\n", r, g, b)
        printf("Circumference = %.3f\n", 2.0 * 3.14 * radius)
        printf("Area = %.3f\n", 3.14 * radius * radius)
    }
}

// Enter your name: Jim
// Hello Jim!
// Your name has 3 letters
// Is it a short name? true
// Uppercase name: JIM
// Area = 78.50 cm
// Circle colour = (200,450,670)
// Circumference = 31.400
// Area = 78.500