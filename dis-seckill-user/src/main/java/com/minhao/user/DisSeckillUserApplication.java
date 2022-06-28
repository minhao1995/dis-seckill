package com.minhao.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.minhao.user.mapper")
public class DisSeckillUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisSeckillUserApplication.class, args);
    }

}
