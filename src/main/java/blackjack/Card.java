package blackjack;

import java.util.Objects;

public class Card {

    private final Pattern pattern;
    private final Value value;

    public Card(Pattern pattern, Value value) {
        this.pattern = pattern;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return pattern == card.pattern && value == card.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, value);
    }

    public Pattern getPattern() {
        return pattern;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.getNum() + pattern.getString();
    }
}
