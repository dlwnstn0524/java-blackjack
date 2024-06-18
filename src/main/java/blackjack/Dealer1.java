package blackjack;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.reducing;

public class Dealer1 implements Player {
    private List<Card> cards = new ArrayList<>();
    private int cardSum = 0;
    private boolean playYn = false;

    public Dealer1(Card... cards) {
        for (int i = 0; i < cards.length; i++) {
            this.cards.add(cards[i]);
            this.cardSum = cards[i].getValue().getNum();
        }

    }

    @Override
    public int CalculateCardSum() {
        return cards.stream()
                .map(Card::getValue)
                .collect(reducing(0, Value::getNum, Integer::sum));
    }

    @Override
    public boolean playYn() {
        if (CalculateCardSum() > 21) {
            return false;
        }
        return false;
    }

    public String getFirstCard() {
        return cards.get(0).toString();
    }

    public int getCardSum() {
        return cardSum;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
}
