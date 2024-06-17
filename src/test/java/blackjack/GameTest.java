package blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    @DisplayName("사용자 이름을 입력받고 플레이어 배열을 생성한다.")
    public void playGame(){
        Game game = new Game("pobi", "jason");
        assertThat(game.getPlayers().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("각 플레이어는 두 장의 카드를 갖는다")
    void userTwoCards(){
        Game game = new Game("pobi", "jason");
        assertThat(game.getPlayers()
                .stream()
                .map(User::getCards)
                .collect(Collectors.toList())
                .size())
                .isEqualTo(2);
    }

    @Test
    @DisplayName("딜러는 두 장의 카드를 갖는다")
    void dealerTwoCards(){
        Game game = new Game("pobi", "jason");
        assertThat(game.getDealer().getCards().size())
                .isEqualTo(2);
    }



}
