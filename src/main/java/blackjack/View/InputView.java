package blackjack.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String[] requireUserNames() throws IOException {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String[] userNames = br.readLine().split(",");
        return userNames;
    }

    public static String requireContinue(String name) throws IOException {
        System.out.println(name + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        return br.readLine();
    }

}
