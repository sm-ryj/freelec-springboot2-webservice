package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application { //메인 클래스 - 항상 프로젝트 최상단에 위치해야함
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}