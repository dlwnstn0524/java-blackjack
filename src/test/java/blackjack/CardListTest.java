package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CardDequeTest {

    @Test
    @DisplayName("덱은 52장으로 구성되어 있다")
    void test2(){
        CardDeque cardList = new CardDeque();
        assertThat(cardList.getCards().size()).isEqualTo(52);
    }

    @Test
    @DisplayName("덱은 생성될때 셔플된다")
    void test(){
        CardDeque cardList = new CardDeque();

    }

}