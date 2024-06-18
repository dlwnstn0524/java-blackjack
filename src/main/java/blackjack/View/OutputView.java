package blackjack.View;

import blackjack.Dealer;
import blackjack.User;

import java.util.List;

public class OutputView {

    private static String DEALER_HAND_OUT = "딜러는 16이하라 한장의 카드를 더 받았습니다.";

    public static void initProcess(String state) {
        System.out.println(state);
    }

    public static void dealerHandOut() {
        System.out.println(DEALER_HAND_OUT);
    }

    public static void userHandOut(String msg){
        System.out.println(msg);
    }

    public static void calculateResult(String msg) {
        System.out.println(msg);
    }
}
