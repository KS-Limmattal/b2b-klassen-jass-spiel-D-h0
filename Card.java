/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {
    private Suit suit;
    private Rank rank;

    // constructors
    public Card(Suit suit, Rank rank) {
        this.setRank(rank);
        this.setSuit(suit);

    }

    public Card(Card card) {
        this(card.suit, card.rank);
    }

    // getters
    public Rank getRank() {
        return this.rank;
    }
    
    public Suit getSuit() {
        return this.suit;
    }

    // setters
    public void setRank(Rank card_rank) {
        this.rank = card_rank;
    }

    public void setSuit(Suit card_suit) {
        this.suit = card_suit;
    }

    // toString
    public String toString() {
        return "Karte: " + this.suit + " " + this.rank;
    }
    
    // equals
    public boolean equals(Card other) {
        return this.suit == other.suit && this.rank == other.rank;
    }

    public static boolean equals(Card this_card, Card that_card) {
        return this_card.suit == that_card.suit && this_card.rank == that_card.rank;
    }
}

