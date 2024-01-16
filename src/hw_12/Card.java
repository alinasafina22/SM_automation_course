package hw_12;

public class Card {
    private String rank;
    private Suit suit;

    public Card(String rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return rank + suit.getSymbol();
    }
}
