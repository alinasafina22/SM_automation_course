package hw_12;
import java.util.List;

public class PockerGame {
    public static void main(String[] args) {
        // Задаются количество игроков и количество карт на руках.
        int players = 2; // Количество игроков
        int cardsPerPlayer = 6; // Количество сдаваемых карт

        Deck deck = new Deck();
        // Создается колода.

        for (int playerNum = 1; playerNum <= players; playerNum++) {
            List<Card> hand = deck.dealCards(players, cardsPerPlayer);
            // Каждому игроку раздаются карты.

            System.out.println("Игрок " + playerNum + ": " + hand);
            // Выводится в консоль раздача для каждого игрока.
        }
    }
}
