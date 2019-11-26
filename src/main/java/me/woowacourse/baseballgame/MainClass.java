package me.woowacourse.baseballgame;

import me.woowacourse.baseballgame.domain.NumberValidator;
import me.woowacourse.baseballgame.domain.RandomNumbers;
import me.woowacourse.baseballgame.view.UserInput;

/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 * @apiNote : 프로그램 실행을 위한 Main Class 입니다.
 * @apiNote : 프로그램 설명 --> 랜덤한 3자리 난수를 생성 한 후 사용자에게 세자리 수를 입력받아 일치하는지 아닌지를 테스트하는 프로그램
 * @apiNote : 각 자리수를 비교하여 자리수와 수 모두 같은 경우 :Strike, 자리수는 다르지만 수는 존재하는 경우 :Ball, 없는 숫자의 경우 :Nothing
 */
public class MainClass {
    private static final NumberValidator Numbervalidator = NumberValidator.getInstance();

    private static String userInput;
    private static String randomNumber;

    public static void main(String[] args) {
        while (true) {
            if (UserInput.endGame())
                break;
            randomNumber = RandomNumbers.makeNumber();
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
