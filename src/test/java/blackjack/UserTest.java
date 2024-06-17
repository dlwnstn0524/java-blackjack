package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    @DisplayName("사용자는 카드를 더 받을지 말지 결정할 수 있다")
    void test(){
        User user = new User("pobi"
                , new Card(Pattern.CLOVER, Value.KING)
                , new Card(Pattern.DIAMOND, Value.QUEEN));
        user.addCard(new Card(Pattern.DIAMOND, Value.ACE));
        assertThat(user.getCards().size()).isEqualTo(3);
    }
}
