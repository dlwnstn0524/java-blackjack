//package blackjack;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class DealerTest {
//    @Test
//    @DisplayName("딜러는 자신의 카드의 합을 알고있다")
//    void deal(){
//        Dealer dealer = new Dealer(new Card(Pattern.DIAMOND, Value.TWO), new Card(Pattern.CLOVER, Value.KING));
//        assertThat(dealer.getSum()).isEqualTo(12);
//    }
//
//    @Test
//    @DisplayName("딜러는 자신의 카드의 합을 알고있다")
//    void test2(){
//        Dealer dealer = new Dealer(new Card(Pattern.DIAMOND, Value.TWO), new Card(Pattern.CLOVER, Value.KING));
//        assertThat(dealer.getSum()).isEqualTo(12);
//    }
//
//}