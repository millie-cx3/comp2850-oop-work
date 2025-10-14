fun main() {
    val names = mutableSetOf("Joe", "Sarah", "Nicole")

    print("Enter your name: ")
    val name = readln()

    if (names.add(name)) {
        println("$name added")
    }
    else {
        println("I'm sorry, we already have a $name")
    }

    val prices = mutableMapOf(
        "Apple" to 32,
        "Orange" to 55,
        "Kiwi" to 20
    )

    println(prices["Apple"]) // prints 32
    
    // val item = ("Pear")
    // prices.getOrElse(item) {
    //     throw NoSuchElementException("No price for $item")
    // }

    prices["Apple"] = 40 // updates price of apple
    prices["Banana"] = 65 // introduces new item and price

    println(prices)

}