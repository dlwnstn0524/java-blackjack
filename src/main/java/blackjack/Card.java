package blackjack;

public class Card {

    private final Pattern pattern;
    private final Value value;

    public Card(Pattern pattern, Value value) {
        this.pattern = pattern;
        this.value = value;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public Value getValue() {
        return value;
    }
}
