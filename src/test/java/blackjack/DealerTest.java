package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DealerTest {
    @Test
    @DisplayName("딜러는 자신이 더 카드를 받아올 수 있는지에 대해 알고 있다")
    void deal(){
        Dealer dealer1 = new Dealer(new Card(Pattern.DIAMOND, Value.TWO), new Card(Pattern.CLOVER, Value.KING));
        assertThat(dealer1.canGet()).isEqualTo(true);

        Dealer dealer2 = new Dealer(new Card(Pattern.DIAMOND, Value.SEVEN), new Card(Pattern.CLOVER, Value.KING));
        assertThat(dealer2.canGet()).isEqualTo(false);
    }

}