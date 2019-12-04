package com.exercise.baseball.domain;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Baseball {
    private static final int ZERO = 0;
    private static final String BLANK = "";
    private static final int ANSWER = 3;
    private static int STRIKE_COUNT = 0;
    private static int BALL_COUNT = 0;

    public static void play() throws IOException {
        User user = new User();
        Computer computer = new Computer();
        String randomNumber = computer.makeRandomNumber();
        System.out.println(randomNumber);
        while (true) {
            String userNumber = user.makeNumber();
            if (compareTwoNumbers(randomNumber, userNumber)) {
                break;
            }
        }
        if (!user.endGame())
            play();
    }

    public static boolean compareTwoNumbers(String userInput, String randomNumber) {
        STRIKE_COUNT = ZERO;
        BALL_COUNT = ZERO;
        List<String> userInputList = Arrays.asList(userInput.split(BLANK));
        String[] randomNumberArray = randomNumber.split(BLANK);
        compareAndPrint(userInputList, randomNumberArray);
        if (STRIKE_COUNT == ANSWER) {
            System.out.print("정답입니다.");
            return true;
        }
        return false;
    }

    private static void compareAndPrint(List<String> userInputList, String[] randomNumberArray) {
        for (int i = 0; i < userInputList.size(); i++) {
            if (userInputList.get(i).equals(randomNumberArray[i]))
                STRIKE_COUNT++;
            else if (userInputList.contains(randomNumberArray[i]) && userInputList.indexOf(randomNumberArray[i]) != i)
                BALL_COUNT++;
        }
        printResult();
    }

    private static void printResult() {
        StringBuilder sb = new StringBuilder();
        if (STRIKE_COUNT == ZERO && BALL_COUNT == ZERO)
            sb.append("NOTHING");
        if (STRIKE_COUNT > ZERO)
            sb.append("STRIKE : " + STRIKE_COUNT);
        if (BALL_COUNT > ZERO)
            sb.append(" BALL : " + BALL_COUNT);
        System.out.println(sb.toString());
    }
}
