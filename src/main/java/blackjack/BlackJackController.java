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
    private Dealer1 dealer1;
    private List<User1> users2 = new ArrayList<>();

    public void run() throws IOException {
        initGame();
        handOut();
    }

    private void handOut() throws IOException {
        for (User1 user : users2) {
            while (InputView.requireContinue(user.getName()).equals("y")) {
                user.addCard(cardDeque.handOut());
                System.out.println(user.getName() + " " + user.getCards() + "\n" + user.getSum());
                if (!user.playYn()) {
                    break;
                }
            }
        }

        if (dealer1.getCardSum() <= 16) {
            dealer1.addCard(cardDeque.handOut());

        }
        System.out.println("딜러카드 : " + dealer1.getCards() + "\n");
        for (User1 user : users2) {
            System.out.println(user.getName() + "카드 " + user.getCards() + "\n");
        }
    }

    private void initGame() throws IOException {
        String[] names = InputView.requireUserNames();

        for (int i = 0; i < names.length; i++) {
            Card card1 = cardDeque.handOut();
            Card card2 = cardDeque.handOut();
            users2.add(new User1(names[i], card1, card2));
        }
        Card card1 = cardDeque.handOut();
        Card card2 = cardDeque.handOut();
        dealer1 = new Dealer1(card1, card2);
        OutputView.initProcess(initResult());
    }

    private String initResult() {
        StringBuilder result = new StringBuilder();
//        result.append("딜러: " + dealer1.getFirstCard() + "\n");
        result.append("딜러: " + dealer1.getCards() + "\n");
        for(User1 user : users2) {
            result.append(user.getName() + " " + user.getCards() + "\n");
        }
        return result.toString();
    }
}
