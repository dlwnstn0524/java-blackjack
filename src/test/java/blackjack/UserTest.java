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

    @Test
    @DisplayName("사용자는 자신이 더 카드를 받아올 수 있는지에 대해 알고 있다")
    void isAvalible(){
        User user1 = new User("pobi", new Card(Pattern.DIAMOND, Value.TWO), new Card(Pattern.CLOVER, Value.KING));
        assertThat(user1.isBusted()).isEqualTo(true);

        User user2 = new User("jason", new Card(Pattern.DIAMOND, Value.QUEEN), new Card(Pattern.CLOVER, Value.KING));
        assertThat(user2.isBusted()).isEqualTo(true);
    }

    @Test
    @DisplayName("사용자는 가능하다면 카드를 뽑아올 수 있다")
    void handOutTest(){
        User user = new User("pobi",
                new Card(Pattern.DIAMOND, Value.TWO),
                new Card(Pattern.CLOVER, Value.KING));
        user.addCard(new Card(Pattern.DIAMOND, Value.QUEEN));
        assertThat(user.getCards().size()).isEqualTo(3);
    }
    @Test
    @DisplayName("사용자는 가능하다면 카드를 뽑아올 수 있다")
    void handOutTest(){

    }
}
