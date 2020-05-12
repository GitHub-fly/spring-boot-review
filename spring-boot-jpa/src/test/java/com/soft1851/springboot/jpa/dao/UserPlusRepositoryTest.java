package com.soft1851.springboot.jpa.dao;

import com.soft1851.springboot.jpa.model.cascade.User;
import com.soft1851.springboot.jpa.model.cascade.UserPlus;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
class UserPlusRepositoryTest {

    @Autowired
    private UserPlusRepository userPlusRepository;

    @Test
    void findByUserName() {
        UserPlus user = userPlusRepository.findByUserName("xunmi");
        System.out.println(user);
    }

    @Test
    void findAll() {
        userPlusRepository.findAll().forEach(System.out::println);
    }
}