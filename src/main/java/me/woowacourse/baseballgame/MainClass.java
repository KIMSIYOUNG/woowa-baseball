package me.woowacourse.baseballgame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            System.out.println("게임을 새로 시작하려면 1번, 종료하려면 2번을 입력해주세요.");
            if(Integer.parseInt(sc.nextLine().trim())==2)
                break;
            makeRandomNumber();

        }
    }

    private static int makeRandomNumber() {
        Set<Integer> setForRandomNumber = new HashSet<>();
        while(setForRandomNumber.size()<3) {
            setForRandomNumber.add((int) (Math.random() * 10));
        }
        return 1;
    }
}
