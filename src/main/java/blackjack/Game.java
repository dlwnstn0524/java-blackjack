package blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Game {

    private Dealer dealer;
    private List<User> users = new ArrayList<>();
    private CardDeque cardDeque;

    public Game(String... names) {
        cardDeque = new CardDeque();

        for (int i = 0; i < names.length; i++) {
            Card card1 = cardDeque.handOut();
            Card card2 = cardDeque.handOut();
            users.add(new User(names[i], card1, card2));
        }
        Card card1 = cardDeque.handOut();
        Card card2 = cardDeque.handOut();
        dealer = new Dealer(card1, card2);
    }

    public List<User> getPlayers() {
        return users;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public boolean play(User user, String answer) {
        if(answer.equals("y")){
            for (User u : users) {
                if (u.getName().equals(user.getName())) {
                    Card card = cardDeque.handOut();
                    u.addCard(card);
                }
            }
            return false;
        } else {
            return true;
        }
    }
}
