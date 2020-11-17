package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTaskApplication {

    private final UserService service;

    @Autowired
    public TestTaskApplication(UserService service) {
        this.service = service;

        service.save(new User("Вася",
                "Васькин",
                (byte) 22,
                "муж"));
    }

    public static void main(String[] args) {


        SpringApplication.run(TestTaskApplication.class, args);

    }

}
