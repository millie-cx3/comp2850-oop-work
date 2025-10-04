fun main () {
    print("PIZZA MENU\n")
    print("\n")
    print("(a) Margherita\n")
    print("(b) Quattro Stagioni\n")
    print("(c) Seafood\n")
    print("(d) Hawaiian\n")
    print("\n")

    do {
        print("Choose your pizza (a-d): ")
        val choice = readln().lowercase()

        if (choice !in "a".."d") {
            print("Invalid selection! Try again!\n")
        }
    } while (choice !in "a".."d")

    println("Order accepted!")

}
