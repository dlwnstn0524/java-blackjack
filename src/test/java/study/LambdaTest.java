package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LambdaTest {
    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = List.of(1, 2, 3, 4, 5, 6);
    }

    @Test
    void sumAll() {
        final int result = sum(numbers, num -> true);
        assertThat(result).isEqualTo(21);
    }

    @Test
    void sumAllEven() {
        final int result = sum(numbers, num -> num%2==0);
        assertThat(result).isEqualTo(12);
    }

    @Test
    void sumAllOverThree(){
        final int result = sum(numbers, num -> num>3);
        assertThat(result).isEqualTo(15);
    }

    private int sum(List<Integer> numbers, Predicate<Integer> addable) {
        int total = 0;
        for (int number : numbers) {
            if (addable.test(number)){
                total += number;
            }
        }
        return total;
    }

//    @FunctionalInterface
//    interface Addable{
//        boolean canAdd(int num);
//    }
//
//    class AllAddalbe implements Addable {
//        @Override
//        public boolean canAdd(int a) {
//            return true;
//        }
//    }
//
//    class EvenAddable implements Addable {
//        @Override
//        public boolean canAdd(int a) {
//            return a % 2 == 0;
//        }
//    }


//    private int sumAllEven(List<Integer> numbers, Addable addable) {
//        int total = 0;
//        for (int number : numbers) {
//            if (addable.canAdd()) {
//                total += number;
//            }
//        }
//        return total;
//    }
}
