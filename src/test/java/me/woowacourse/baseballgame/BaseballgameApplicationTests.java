package me.woowacourse.baseballgame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BaseballgameApplicationTests {

    @Test
    public void helloWorld(){
        String helloWorld = "Hello world";
        assertEquals(helloWorld,"Hello world");
    }
    @Test
    public void ValidateRandomNumber(){
        int randomNumber = (int) (Math.random() * 9) + 1;
        for(int i = 0; i < 100000; i++){
            assertTrue(randomNumber>=1);
            assertTrue(randomNumber<=9);
        }
    }

}
