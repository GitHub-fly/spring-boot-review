package com.soft1851.springboot.start.controller;

import org.apache.catalina.filters.ExpiresFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    // http 请求的模拟对象，桩对象
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
    }


    @Test
    void hello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/hello")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .string("Hello, Spring Boot"));
    }

    @Test
    void testHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/hello/xunmi")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }

    @Test
    void hello1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/hello1")
                .param("name", "xunmi")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }
}