package blackjack;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        BlackJackController controller = new BlackJackController();
        controller.run();
    }
}
