/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
public class Jass {
    
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        // pop once so that EICHELN ASS will be removed since it is the last card and will be added back later on
        deck.pop();

        // shuffle
        deck.shuffle();


        // pop the remaining 29 cards
        for (int i = 0; i<29; i++) {
            deck.pop();

        }

        // add the EICHELN ASS
        Card temp_Card = new Card(Suit.EICHELN, Rank.ASS);
        deck.addCard(temp_Card);
        // print the deck to the console
        for (int i = 0; i < deck.getCards().length; i++) {
            System.out.println(deck.getCards()[i].toString());
        }
    }
}

// i forgor the camelCase :(
