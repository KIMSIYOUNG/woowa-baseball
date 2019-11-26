package me.woowacourse.baseballgame.domain;

/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 * @apiNote : 사용자 입력값 검증을 위한 Interface입니다.
 */
public interface Validator {

    /**
     * @param randomNumber : 무작위로 추출된 세자리 수
     * @param userInput : 이를 맞히기 위한 사용자의 입력값
     * @return true/false : 검증 완료유무 반환
     * @apiNote : 시스템 내에서 출력하는 것이라, 반환값의 의미는 떨어집니다.
     */
    public boolean randomNumberCompareToUserInput(String randomNumber, String userInput);
}
