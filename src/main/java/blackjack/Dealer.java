package blackjack;

import java.util.*;

public class Dealer {

    private List<Card> cards = new ArrayList<>();
    private int sum;
    private boolean isAvalible;

    public Dealer(Card... cards) {
        this.sum = 0;
        for (int i = 0; i < cards.length; i++) {
            this.cards.add(cards[i]);
            this.sum += cards[i].getValue().getNum();
        }
    }

    public void addCard(Card card) {
        cards.add(card);
        sum += card.getValue().getNum();
        calculateIsAvalible();
    }

    private void calculateIsAvalible() {

        if (sum > 15) {
            isAvalible = false;
        } else {
            isAvalible = true;
        }
    }

    public String getFirstCard() {
        return cards.get(0).toString();
    }

    public boolean isAvalible() {
        return isAvalible;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getSum() {
        return sum;
    }
}
