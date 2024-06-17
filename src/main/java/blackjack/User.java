package blackjack;

import java.util.Collection;
import java.util.List;

public class User {

    private final String name;
    public User(String name) {
        this.name = name;
    }


    public String getUserName() {
        return name;
    }

    public List<Card> getCards() {
        return null;
    }
}
