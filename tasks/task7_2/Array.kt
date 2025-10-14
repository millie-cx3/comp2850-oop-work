fun main() {
    val numbers = intArrayOf(9, 6, 3, 2)
    val names = arrayOf("Nine", "Three", "Six", "Two")

    val numbers2 = Array<Float>(100) {0.0f}


    val cls = numbers::class 
    println(cls.qualifiedName)
    println(cls.java)

    println(numbers[1])
    println(names[0])

    println numbers.get(0)
}