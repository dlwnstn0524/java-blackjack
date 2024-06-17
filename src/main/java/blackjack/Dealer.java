package blackjack;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.reducing;

public class Dealer {

    private List<Card> cards = new ArrayList<>();

    public Dealer(Card... cards) {
        for (int i = 0; i < cards.length; i++) {
            this.cards.add(cards[i]);
        }
    }

    public boolean canGet(){
        if (getSum() <= 16) {
            return true;
        }
        return false;
    }

    public List<Card> getCards() {
        return cards;
    }

    private Integer getSum() {
        return cards.stream()
                .map(Card::getValue)
                .collect(reducing(0, Value::getNum, Integer::sum));
    }

    public String getFirstCard() {
        return cards.get(0).toString();
    }
}
