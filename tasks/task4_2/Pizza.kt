fun main () {
    print("PIZZA MENU\n")
    print("\n")
    print("(a) Margherita\n")
    print("(b) Quattro Stagioni\n")
    print("(c) Seafood\n")
    print("(d) Hawaiian\n")
    print("\n")
    print("Choose your pizza (a-d): ")
    val choice = readln().lowercase()

    if (choice.length != 1) {
        println("Invalid choice!")
    }

    else if (choice in "a".."d") {
        println("Order accepted")
    }

    else {
        println("Invalid choice!")
    }
}