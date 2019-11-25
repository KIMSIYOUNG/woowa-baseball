package me.woowacourse.baseballgame;

import java.util.*;

public class MainClass {
    private static final Scanner sc = new Scanner(System.in);
    private static String userInput;
    private static final int END_GAME = 2;

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
        int strike = 0;
        int ball = 0;
        int nothing = 0;
        String[] userInputArray = userInput.split("");
        String[] randomNumberArray = randomNumber.split("");
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
        String randomNumber = "";

        while (setForRandomNumber.size() < 3) {
            setForRandomNumber.add((int) (Math.random() * 9) + 1);
        }
        for (Integer s : setForRandomNumber)
            randomNumber += String.valueOf(s);
        return randomNumber;
    }
}
