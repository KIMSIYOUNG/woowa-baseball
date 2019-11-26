package me.woowacourse.baseballgame.domain;

import java.util.Arrays;
import java.util.List;

/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 * @apiNote : 입력값과 랜덤값 검증을 위한 클래스입니다.
 */
public class NumberValidator implements Validator{
    private static final int DEFALUT_INT_ZERO = 0;
    private static final String DEFALUT_STRING_BLANK = "";

    public static NumberValidator getInstance(){
        return new NumberValidator();
    }

    /**
     * @param randomNumber : 무작위로 생성된 세자리 수
     * @param userInput : 무작위 수를 맞히기 위해 사용자가 입력한 수
     * @apiNote : 무작위 수를 맞히기 위해 사용자가 입력한 수와 비교하여 Strike, Ball, Nothing을 출력하는 메소드입니다.
     */
    @Override
    public boolean randomNumberCompareToUserInput(String randomNumber, String userInput) {
        int strike = DEFALUT_INT_ZERO;
        int ball = DEFALUT_INT_ZERO;
        int nothing = DEFALUT_INT_ZERO;

        String[] userInputArray = userInput.split(DEFALUT_STRING_BLANK);
        List<String> randomNumberList = Arrays.asList(randomNumber.split(DEFALUT_STRING_BLANK));

        for (int i = 0; i < userInputArray.length; i++) {
            if (randomNumberList.contains(userInputArray[i])
                    && randomNumberList.indexOf(userInputArray[i]) == i) {
                strike++;
            } else if (randomNumberList.contains(userInputArray[i])
                    && randomNumberList.indexOf(userInputArray[i]) != i) {
                ball++;
            } else {
                nothing++;
            }
        }
        System.out.println("Strike : " + strike + "  Ball : " + ball + "  nothing : " + nothing);
        return true;
    }

}
