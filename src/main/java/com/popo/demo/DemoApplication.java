package com.popo.demo;

import com.popo.demo.user.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

//    you need to manually execute the following sql to create the database before running
//    CREATE SCHEMA `demo-jpa-mybatis` DEFAULT CHARACTER SET utf8mb4 ;

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        userService.test();
    }
}
