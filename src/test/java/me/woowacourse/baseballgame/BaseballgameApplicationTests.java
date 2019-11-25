package me.woowacourse.baseballgame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BaseballgameApplicationTests {

    @Test
    public void helloWorld(){
        String helloWorld = "Hello world";
        assertEquals(helloWorld,"Hello world");
    }
    @Test
    public void validateRandomNumber(){
        int randomNumber = (int) (Math.random() * 9) + 1;
        for(int i = 0; i < 100000; i++){
            assertTrue(randomNumber>=1);
            assertTrue(randomNumber<=9);
        }
    }
    @Test
    public void validateRandomNumberPlus(){
        Set<Integer> setForRandomNumber = new HashSet<>();
        String result = "";
        while(setForRandomNumber.size()<3){
            setForRandomNumber.add((int)(Math.random() * 9)+1);
        }
        for(Integer s : setForRandomNumber)
            result += String.valueOf(s);
        for(int i=0; i<100000; i++){
            assertTrue(Integer.parseInt(result)>=100);
            assertTrue(Integer.parseInt(result)<=999);
        }
    }
}
