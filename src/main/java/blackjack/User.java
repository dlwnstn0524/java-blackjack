package blackjack;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private List<Card> cards = new ArrayList<>();
    private boolean isBusted;
    private int sum;


    public User(String name, Card card1, Card card2) {
        this.name = name;
        cards.addAll(List.of(card1, card2));
        this.sum = card1.getValue().getNum() + card2.getValue().getNum();
        this.isBusted = true;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
        sum += card.getValue().getNum();
        calculateIsAvalible();
    }

    public int getSum() {
        return sum;
    }

    private void calculateIsAvalible() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue().getNum();
        }
        if (sum > 21) {
            isBusted = false;
        } else {
            isBusted = true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isBusted() {
        return isBusted;
    }
}
