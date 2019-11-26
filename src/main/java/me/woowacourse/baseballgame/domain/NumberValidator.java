package me.woowacourse.baseballgame.domain;

import java.util.Arrays;
import java.util.List;

public class NumberValidator implements Validator{
    private static final int DEFALUT_INT_ZERO = 0;
    private static final String DEFALUT_STRING_BLANK = "";

    public static NumberValidator getInstance(){
        return new NumberValidator();
    }

    @Override
    public boolean randomNumberCompareToUserInput(String randomNumber, String userInput) {
        int strike = DEFALUT_INT_ZERO;
        int ball = DEFALUT_INT_ZERO;
        int nothing = DEFALUT_INT_ZERO;
        String[] userInputArray = userInput.split(DEFALUT_STRING_BLANK);
        List<String> randomNumberList = Arrays.asList(randomNumber.split(DEFALUT_STRING_BLANK));
        /*
        변수이름을 축약하지 않고, 알기쉽게 하니까 코드가 너무 길어지는 거 같은데 이게 맞는건가?
         */
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
        return false;
    }
}
