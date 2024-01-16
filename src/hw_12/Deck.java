package hw_12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (int i = 2; i <= 14; i++) {
                String rank = (i <= 10) ? String.valueOf(i) : switch (i) {
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    case 14 -> "A";
                    default -> throw new IllegalStateException("Unexpected value: " + i);
                };
                cards.add(new Card(rank, suit));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public List<Card> dealCards(int players, int cardsPerPlayer) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
}