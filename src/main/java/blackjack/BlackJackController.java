package blackjack;

import blackjack.View.InputView;
import blackjack.View.OutputView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BlackJackController {

    private List<User> users = new ArrayList<>();
    private Dealer dealer;
    private CardDeque cardDeque = new CardDeque();

    public void run() throws IOException {
        initGame();
        handOut();
    }

    private void handOut() throws IOException {
//        for(User user : game.getPlayers()) {
//            game.play(user, InputView.requireContinue(user.getName()));
//        }
    }

    private void initGame() throws IOException {
        String[] names = InputView.requireUserNames();
        for (int i = 0; i < names.length; i++) {
            Card card1 = cardDeque.handOut();
            Card card2 = cardDeque.handOut();
            users.add(new User(names[i], card1, card2));
        }
        Card card1 = cardDeque.handOut();
        Card card2 = cardDeque.handOut();
        dealer = new Dealer(card1, card2);
        OutputView.initProcess(initResult());
    }

    private String initResult() {
        StringBuilder result = new StringBuilder();
        result.append("딜러: " + dealer.getFirstCard());
        for(User user : users) {
            result.append(user.getName() + " ");
        }
        return result.toString();
    }
}
