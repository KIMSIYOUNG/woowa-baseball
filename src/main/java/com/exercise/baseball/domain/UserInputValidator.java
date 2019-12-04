package com.exercise.baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class UserInputValidator {
    private static Set<String> setForCheckDigits = new HashSet<>();
    private static final String DIGIT_ERROR_MESSAGE = "3자리 서로 다른 수를 입력해주세요.";
    private static final String STRING_ERROR = "문자는 입력이 되지 않습니다. ";
    private static final int DIGITS = 3;
    private static final int END_GAME = 2;
    private static final int START_GAME = 1;
    private static final String BLANK = "";


    public boolean checkEndGame(String userInput) {
        if (checkStringError(userInput)
                && (Integer.parseInt(userInput) == START_GAME || Integer.parseInt(userInput) == END_GAME))
            return true;
        return false;
    }

    public boolean checkMakeNumber(String userInput) {
        setForCheckDigits.clear();
        String[] userInputArray = userInput.split(BLANK);
        for (int i = 0; i < userInputArray.length; i++)
            setForCheckDigits.add(userInputArray[i]);
        if (checkStringError(userInput) && setForCheckDigits.size() == DIGITS)
            return true;
        System.out.println(BLANK + DIGIT_ERROR_MESSAGE);
        return false;
    }

    public boolean checkStringError(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            System.out.print(STRING_ERROR);
            return false;
        }
    }

}
