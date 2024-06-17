package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


class CardTest {
    @Test
    @DisplayName("카드는 고유한 숫자와 문양을 가지고 있다")
    public void initTest(){
        Card card = new Card(Pattern.CLOVER, Value.FOUR);
        assertThat(card.getPattern()).isEqualTo(Pattern.CLOVER);
        assertThat(card.getValue()).isEqualTo(Value.FOUR);
    }

    @Test
    @DisplayName("카드는 중복되지 않는다")
    public void duplicateCard(){
        Card card = new Card(Pattern.CLOVER, Value.FOUR);
        assertThatIllegalArgumentException().isThrownBy(()-> new Card(Pattern.CLOVER, Value.FOUR));
    }
}