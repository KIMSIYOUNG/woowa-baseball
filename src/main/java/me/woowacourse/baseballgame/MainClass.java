package me.woowacourse.baseballgame;

import me.woowacourse.baseballgame.domain.NumberValidator;
import me.woowacourse.baseballgame.domain.RandomNumbers;
import me.woowacourse.baseballgame.view.UserInput;

import java.util.*;

/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 * @apiNote : 프로그램 실행을 위한 Main Class 입니다.
 */
public class MainClass {
    /*
    하드코딩하지 않고 상수로 만들려 하니 상수가 너무 많은 느낌.
     */
    private static final NumberValidator Numbervalidator = NumberValidator.getInstance();

    private static String userInput;

    public static void main(String[] args) {
        while (true) {
            if (UserInput.endGame())
                break;
            String randomNumber = RandomNumbers.makeNumber();
            System.out.println("세자리 수를 입력해주세요  ");
            do {
                System.out.print("숫자를 아래에 입력해주세요 --> 이전 결과 :  ");
                userInput = UserInput.makeNumber();
                Numbervalidator.randomNumberCompareToUserInput(randomNumber, userInput);
            } while (!(userInput.equals(randomNumber)));
            System.out.println("정답을 맞히셨습니다.");
        }
    }
}
