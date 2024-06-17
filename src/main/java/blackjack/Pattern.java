package blackjack;

public enum Pattern {
    CLOVER("클로버"), SPADE("스페이드"), HEART("하트"), DIAMOND("다이아몬드");

    private final String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String getString() {
        return pattern;
    }
}
;