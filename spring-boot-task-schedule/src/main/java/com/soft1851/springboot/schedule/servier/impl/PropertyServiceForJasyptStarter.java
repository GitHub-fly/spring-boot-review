package com.soft1851.springboot.schedule.servier.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author xunmi
 * @ClassName PropertyServiceForJasyptStarter
 * @Description TODO
 * @Date 2020/5/17
 * @Version 1.0
 **/
//@Service
public class PropertyServiceForJasyptStarter {

    @Value("${encrypted.property}")
    private String property;

    public String getProperty() {
        return property;
    }

    public String getPasswordUsingEnvironment(Environment environment) {
        return environment.getProperty("encrypted.property");
    }
}

