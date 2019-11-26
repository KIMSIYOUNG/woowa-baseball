package me.woowacourse.baseballgame.domain;

import java.util.HashSet;
import java.util.Set;

public class RandomNumbers{
    private static final String DEFALUT_STRING_BLANK = "";
    private static final int DIGIT_NUMBER = 3;
    private static final int RANGE_OF_NUMBER = 9;
    private static final int START_POINT_OF_NUMBER = 1;

    public static String makeNumber(){
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
