package me.woowacourse.baseballgame.view;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static boolean endGame(){
        System.out.println("게임을 새로 시작하려면 1번, 종료하려면 2번을 입력해주세요.");
        return (sc.nextInt()==2)?true:false;
    }
    public static String makeNumber(){
        return String.valueOf(sc.nextInt());
    }
}
