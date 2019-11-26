package me.woowacourse.baseballgame.view;

import java.util.Scanner;
/**
 * @author : 김시영
 * @version : 1.0
 * @java-version : 1.8
 * @updated_at : 2019-11-25
 * @apiNote : 사용자 입력을 위한 클래스입니다.
 */
public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    /**
     * @return true/false
     * @apiNote 게임을 중단할 지 시작할 지 결정하는 메서드입니다.
     */
    public static boolean endGame(){
        System.out.println("게임을 새로 시작하려면 1번, 종료하려면 2번을 입력해주세요.");
        return (sc.nextInt()==2)?true:false;
    }

    /**
     * @return 사용자의 입력값을 반환하는 메서드입니다.
     * @apiNote 입력값과 랜덤값을 비교하기 위해 문자형태로 반환하였습니다.
     */
    public static String makeNumber(){
        return String.valueOf(sc.nextInt());
    }
}
