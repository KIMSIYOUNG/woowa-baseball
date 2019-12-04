package com.exercise.baseball.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    private static final String BLANK = "";
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final String RESTART_MESSAGE = " 게임을 다시 시작하려면 1번, 종료하려면 2번을 입력해주세요";
    private static final String MAKE_NUMBER = "서로다른 세 자리수를 입력해주세요 아래에 결과가 출력됩니다";
    private static UserInputValidator validator = new UserInputValidator();
    private static final int END_GAME = 2;

    public boolean endGame() throws IOException {
        String userInput = BLANK;

        while (true) {
            System.out.println(RESTART_MESSAGE);
            userInput = br.readLine().trim();
            if (validator.checkEndGame(userInput))
                break;
        }
        if (Integer.parseInt(userInput) == END_GAME) {
            return true;
        }
        return false;
    }

    public String makeNumber() throws IOException {
        System.out.println(MAKE_NUMBER);
        String userInput = BLANK;
        while (true) {
            userInput = br.readLine().trim();
            if (validator.checkMakeNumber(userInput))
                break;
        }
        return userInput;
    }

}
