// Task 12.8.2: program to manipulate playing cards

fun main() {
    val deck = mutableListOf<Card>()

    for (rank in Rank.values()) {
        for (suit in Suit.values()) {
            deck.add(Card(rank, suit))
        }
    }

    deck.shuffle()
    for (card in deck) {
        println(card.fullName)
    }

    for (card in deck) {
        println(card)
    }
}
