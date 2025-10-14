fun main() {
    val person = Pair("Sarah", 37)
    val person2 = Triple("Joe", 24, 1.75f)
    val person3 = "Bob" to 45

    println(person.first)
    println(person.second)

    val (name, age) = person3
    println("Name is $name, age is $age")
}