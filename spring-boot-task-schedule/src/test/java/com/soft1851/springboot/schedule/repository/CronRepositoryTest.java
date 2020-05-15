package com.soft1851.springboot.schedule.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CronRepositoryTest {

    @Autowired
    private CronRepository cronRepository;

    @Test
    void updateCron() {
        cronRepository.updateCron("0/8* * * * ?", 1);
    }
}