// Task 12.8.2: class to represent playing cards

class Card(val rank: Rank, val suit: Suit) {
    val fullName: String
        get() = "${rank.name} of ${suit.name}"
    
    override fun toString(): String = "${rank.symbol}${suit.symbol}"
}