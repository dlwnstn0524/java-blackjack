package blackjack;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private List<Card> cards = new ArrayList<>();


    public User(String name, Card card1, Card card2) {
        this.name = name;
        cards.addAll(List.of(card1, card2));
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public String getName() {
        return name;
    }
}
