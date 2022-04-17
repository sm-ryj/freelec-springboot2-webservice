package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application { //메인 클래스 - 항상 프로젝트 최상단에 위치해야함
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}