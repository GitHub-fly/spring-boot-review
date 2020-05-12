package com.soft1851.springboot.config;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author xunmi
 */
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {

//        SpringApplication.run(ConfigApplication.class, args);

        new SpringApplicationBuilder(ConfigApplication.class)
                .bannerMode(Banner.Mode.CONSOLE).run(args);
    }
}
