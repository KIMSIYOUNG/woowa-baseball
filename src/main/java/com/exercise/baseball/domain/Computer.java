package com.exercise.baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class Computer {
    private static String BLACK = "";
    private static int DIGITS = 3;
    private static int START_NUMBER = 1;
    private static int RANGE_OF_NUMBER = 9;

    public String makeRandomNumber() {
        String randomNumber = BLACK;
        Set<Integer> setForRandomNumber = new HashSet<>();

        while (setForRandomNumber.size() != DIGITS) {
            setForRandomNumber.add((int) (Math.random() * RANGE_OF_NUMBER) + START_NUMBER);
        }
        for (Integer s : setForRandomNumber)
            randomNumber += String.valueOf(s);
        return randomNumber;
    }
}
