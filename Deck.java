import java.util.Random;
import java.util.Arrays;

/**
 * Diese Klasse repräsentiert einen Kartenstapel mit einer variablen Anzahl
 * Karten
 * Sie soll ein Array von Typ Card als Instanzvariable haben,
 * - einen Konstruktor Deck(Card[] cards), welches eine Instanz bestehend aus
 * den gegebenen Karten kreiert,
 * - einen Konstruktor Deck(), welcher ein vollständiges Kartenset (4x9 Karten)
 * erzeugt,
 * - einen (trivialen) Getter getCards()
 * - eine Methode addCard(Card card), welche zum Deck eine Karte hinzufügt,
 * falls diese noch nicht im Deck enthalten ist und andernfalls eine Warnung auf
 * der Konsole ausgibt
 * - eine Methode pop(), welche die letzte Karte im Array aus dem Deck entfernt,
 * sofern Karten vorhanden sind
 * - eine Methode shuffle(), welche die Karten im Array durchmischt
 * 
 * Tipps:
 * - Um ein Array zu redimensionieren, verwende den Befehl "Arrays.copyOf" aus
 * java.util.Arrays
 * - Um eine zufällige Ganzzahl in einem gegebenen Bereich zu erzeugen, verwende
 * "rnd.nextInt", wobei "rnd" eine Instanz der Klasse "Random" aus
 * "java.util.Random" bezeichnet
 *
 */
public class Deck {
    // create an array with all cards
    private Card[] all_cards = new Card[0];

    // TODO: Konstruktor Deck()
    public Deck(Card[] cards) throws Exception {
        // add the cards from another Card[] array to this deck
        for (Card current_card: cards) {
            this.addCard(current_card);
        }
    }

    // TODO: Konstruktor Deck() fuer ein vollständiges Deck
    public Deck() throws Exception {
        // nice way to loop
        for (Suit current_suit: Suit.values()) {
            for (Rank current_rank: Rank.values()) {
                Card current_card = new Card(current_suit, current_rank);
                addCard(current_card);
            }
        }
    }

    // TODO: Getter
    public Card[] getCards() {
        // do i need to explain anything here 
        return all_cards;

    }

    // TODO: addCard()
    public void addCard(Card card) throws Exception {
        // catch case where card is already in Deck and throw exception
        for (int c = 0; c < all_cards.length; c++) {
            if (card.equals(all_cards[c])) {
                throw new Exception("Card already in deck");
            }
        }

        // else add the card to the back of the deck
        this.all_cards = Arrays.copyOf(this.all_cards, this.all_cards.length+1);
        this.all_cards[this.all_cards.length-1] = card;
    }

    // TODO: pop()
    public void pop() {
        // just make the array shorter it'sn not that deep
        this.all_cards = Arrays.copyOf(this.all_cards, this.all_cards.length-1);
    }

    // swap function becuase i can't figure anything out right now and i need help
    public Card[] swap(Card[] card_list, int a, int b){
        Card temp = card_list[a];
        card_list[a] = card_list[b];
        card_list[b] = temp;
        return card_list;


    }
    // TODO: shuffle()
    public void shuffle() {

        // inspired by the python "shuffle" function
        // nah but srsly why not just use Collections.shuffle -_-
        // https://stackoverflow.com/questions/17489477/shuffle-a-python-list-without-using-the-built-in-function
        int last_index = this.all_cards.length -1;
        Random rnd = new Random();

        while (last_index > 0) {
        int random_index = rnd.nextInt(0, last_index);
        this.all_cards = swap(this.all_cards, last_index, random_index);
        last_index -= 1;
        // idk how this works but it does
        }
    }

}
