package com.soft1851.springboot.bootstrap;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xunmi
 * @ClassName SpringApplicationBootstrap
 * @Description Spring 应用程序 引导类
 * @Date 2020/5/12
 * @Version 1.0
 **/
public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        // 默认 SpringApplication 启动
//        SpringApplication.run(ApplicationConfiguration.class, args);

        // 通过 SpringApplication API 自定义 SpringApplication 的启动参数
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());

        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        // 关闭默认Web配置
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.setAdditionalProfiles("dev");
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.setHeadless(true);
        springApplication.run(args);

    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }
}
