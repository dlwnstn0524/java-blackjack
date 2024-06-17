package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    @DisplayName("사용자가 생성될 때 이름을 갖는다")
    public void initTest(){
        User user = new User("pobi");
        assertThat(user.getUserName()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("사용자가 생성될 때 카드 2장을 받는다")
    public void initTest2(){
        User user = new User("pobi");

        assertThat(user.getCards().size()).isEqualTo(2);
    }
}
