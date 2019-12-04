package com.exercise.baseball;

import com.exercise.baseball.domain.Baseball;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

public class BaseballApplication {

    public static void main(String[] args) throws IOException {
        Baseball.play();
    }

}
