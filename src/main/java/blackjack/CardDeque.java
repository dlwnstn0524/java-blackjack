package blackjack;

import java.util.Collections;
import java.util.Stack;

public class CardDeque {

    private final Stack<Card> cards = new Stack<>();

    public CardDeque() {
        for (Pattern pattern : Pattern.values()){
            for (Value value : Value.values()){
                cards.push(new Card(pattern, value));
            }
        }

        shuffle();
    }

    private void shuffle(){
        Collections.shuffle(cards);
    }

    public Card handOut() {
        return cards.pop();
    }
}
