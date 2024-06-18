package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

class CardDequeTest {

    @Test
    @DisplayName("덱에는 총 52장의 카드가 들어있다")
    void totalCards() {
        CardDeque cd = new CardDeque();
        for (int i = 0; i < 52; i++) {
            cd.handOut();
        }
        assertThatException().isThrownBy(()->cd.handOut());
    }

    @Test
    @DisplayName("52장의 덱은 모두 중복되지 않는다")
    void noDuplicateCards() {
        CardDeque cd = new CardDeque();
        Set<Card> set = new HashSet<>();
        for (int i = 0; i < 52; i++) {
            set.add(cd.handOut());
        }
        assertThat(set.size()).isEqualTo(52);
    }

}