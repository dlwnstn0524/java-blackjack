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
        dealerHandOut();
        calculate();
        gameResult();
    }

    private void calculate() {
        // 딜러 카드 출력 및 합 출력
        StringBuilder sb = new StringBuilder();
        sb.append("딜러: ");
        List<Card> cards = dealer.getCards();
        for(Card card : cards) {
            sb.append(card + ", ");
        }
        sb.append("- 결과: " + dealer.getSum());
        sb.append("\n");

        // 플레이어 카드 출력 및 합 출력
        for (User user : users) {
            sb.append(user.getName() + ": ");
            List<Card> temp = user.getCards();
            for(Card card : temp) {
                sb.append(card + ", ");
            }
            sb.append("- 결과: " + user.getSum());
            sb.append("\n");
        }
        OutputView.calculateResult(sb.toString());
    }

    private void dealerHandOut() {
        if (dealer.isBusted()){
            OutputView.dealerHandOut();
            dealer.addCard(cardDeque.handOut());
        }
    }

    private void gameResult() {
        // 각 객체의 숫자 합을 활용한 최종 승패 출력
        int win = 0;
        int lose = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("## 최종 승패\n");
        for (User user : users) {

            if (user.isBusted() && user.getSum() > dealer.getSum()){
                lose++;
                sb.append(user.getName() + ": 승\n");
            } else {
                win++;
                sb.append(user.getName() + ": 패\n");
            }

        }
        OutputView.gameResult(sb.toString());
    }

    private void handOut() throws IOException {
        for (User user : users) {
            while(user.isBusted()){
                String answer = InputView.requireContinue(user.getName());
                if (answer.equals("n")) {
                    break;
                }
                if (answer.equals("y")) {
                    user.addCard(cardDeque.handOut());
                    // 유저 추가된 카드 출력하기
                    StringBuilder result = new StringBuilder();
                    result.append(user.getName() + ": ");
                    List<Card> cards = user.getCards();
                    for(Card card : cards) {
                        result.append(card + ", ");
                    }
                    OutputView.userHandOut(result.toString());
                }
            }
        }
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
        result.append("딜러: " + dealer.getFirstCard() + "\n");
        for(User user : users) {
            result.append(user.getName() + ": ");
            List<Card> cards = user.getCards();
            for(Card card : cards) {
                result.append(card + ", ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
