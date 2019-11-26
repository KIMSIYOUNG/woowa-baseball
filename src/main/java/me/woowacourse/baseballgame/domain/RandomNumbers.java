package me.woowacourse.baseballgame.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 * @apiNote : 랜덤숫자 생성을 위한 클래스입니다.
 */
public class RandomNumbers{
    private static final String DEFALUT_STRING_BLANK = "";
    private static final int DIGIT_NUMBER = 3;
    private static final int RANGE_OF_NUMBER = 9;
    private static final int START_POINT_OF_NUMBER = 1;

    /**
     * @return randomNumber
     * @apiNote : 랜덤한 세자리 숫자를 생성하기 위한 메서드입니다.
     */
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
