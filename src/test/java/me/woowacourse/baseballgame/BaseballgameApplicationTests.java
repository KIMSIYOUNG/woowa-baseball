package me.woowacourse.baseballgame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BaseballgameApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void helloWorld(){
        String helloWorld = "Hello world";
        assertEquals(helloWorld,"Hello world");
    }
}
