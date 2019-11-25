package me.woowacourse.baseballgame;

import java.util.*;

/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 */
public class MainClass {
    private static final int END_GAME = 2;
    private static final int DEFALUT_INT_ZERO = 0;
    private static final int DIGIT_NUMBER = 3;
    private static final int RANGE_OF_NUMBER = 9;
    private static final int START_POINT_OF_NUMBER = 1;
    private static final String DEFALUT_STRING_BLANK = "";
    private static final Scanner sc = new Scanner(System.in);

    private static String userInput;

    public static void main(String[] args) {
        while (true) {
            System.out.println("게임을 새로 시작하려면 1번, 종료하려면 2번을 입력해주세요.");
            int game = sc.nextInt();
            if (game == END_GAME)
                break;
            String randomNumber = makeRandomNumber();
            System.out.println("세자리 수를 입력해주세요  ");
            do {
                System.out.print("숫자를 입력해주세요 --> 결과 :  ");
                userInput = String.valueOf(sc.nextInt());
                validateMethod(userInput, randomNumber);

            } while (!(userInput.equals(randomNumber)));
            System.out.println("정답을 맞히셨습니다.");
        }
    }

    private static void validateMethod(String userInput, String randomNumber) {
        int strike = DEFALUT_INT_ZERO;
        int ball = DEFALUT_INT_ZERO;
        int nothing = DEFALUT_INT_ZERO;
        String[] userInputArray = userInput.split(DEFALUT_STRING_BLANK);
        String[] randomNumberArray = randomNumber.split(DEFALUT_STRING_BLANK);
        List<String> randomNumberList = Arrays.asList(randomNumberArray);

        for (int i = 0; i < userInputArray.length; i++) {
            if (randomNumberList.contains(userInputArray[i])
                    && randomNumberList.indexOf(userInputArray[i]) == i) {
                strike++;
            } else if (randomNumberList.contains(userInputArray[i])
                    && randomNumberList.indexOf(userInputArray[i]) != i) {
                ball++;
            } else if (!randomNumberList.contains(userInputArray[i]))
                nothing++;
        }
        System.out.println("Strike : " + strike + "  Ball : " + ball + "  nothing : " + nothing);
    }

    private static String makeRandomNumber() {
        Set<Integer> setForRandomNumber = new HashSet<>();
        String randomNumber = DEFALUT_STRING_BLANK;

        while (setForRandomNumber.size() < DIGIT_NUMBER) {
            setForRandomNumber.add(
                    (int) (Math.random() * RANGE_OF_NUMBER) + START_POINT_OF_NUMBER
            );
        }
        for (Integer s : setForRandomNumber)
            randomNumber += String.valueOf(s);
        return randomNumber;
    }
}
