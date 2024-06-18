package blackjack;

import java.util.*;

public class Dealer {

    private List<Card> cards = new ArrayList<>();
    private int sum;
    private boolean isBusted;

    public Dealer(Card... cards) {
        this.sum = 0;
        for (int i = 0; i < cards.length; i++) {
            this.cards.add(cards[i]);
            this.sum += cards[i].getValue().getNum();
        }
        this.isBusted = true;
    }

    public void addCard(Card card) {
        cards.add(card);
        sum += card.getValue().getNum();
        calculateIsAvalible();
    }

    private void calculateIsAvalible() {

        if (sum > 15) {
            isBusted = false;
        } else {
            isBusted = true;
        }
    }

    public String getFirstCard() {
        return cards.get(0).toString();
    }

    public boolean isBusted() {
        return isBusted;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getSum() {
        return sum;
    }
}
