package blackjack;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.reducing;

public class User1 implements Player{
    private final String name;
    private List<Card> cards = new ArrayList<>();
    private int cardSum = 0;
    private boolean playYn = false;

    public User1(String name, Card card1, Card card2) {
        this.name = name;
        cards.addAll(List.of(card1, card2));
        this.cardSum = card1.getValue().getNum() + card2.getValue().getNum();
    }

    @Override
    public int CalculateCardSum() {
        return cards.stream()
                .map(Card::getValue)
                .collect(reducing(0, Value::getNum, Integer::sum));
    }

    @Override
    public boolean playYn() {
        if (CalculateCardSum() <= 21) {
            return true;
        }
        return false;
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

    public boolean getPlayYn() {
        return playYn;
    }

    public int getSum() {
        return cardSum;
    }
}
