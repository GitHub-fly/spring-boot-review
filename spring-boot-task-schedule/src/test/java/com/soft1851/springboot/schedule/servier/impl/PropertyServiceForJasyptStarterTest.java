//package com.soft1851.springboot.schedule.servier.impl;
//
//import com.soft1851.springboot.schedule.config.AppConfigForJasyptStarter;
//import org.jasypt.util.password.BasicPasswordEncryptor;
//import org.jasypt.util.text.BasicTextEncryptor;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.core.env.Environment;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//
//import javax.security.auth.login.AppConfigurationEntry;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class PropertyServiceForJasyptStarterTest {
//
////    @Autowired
////    private AnnotationConfigApplicationContext appCtx;
////
////    @Test
////    public void whenDecryptedPasswordNeeded_GetFromService() {
////        System.setProperty("jasypt.encryptor.password", "password");
////        PropertyServiceForJasyptStarter service = appCtx
////                .getBean(PropertyServiceForJasyptStarter.class);
////
////        assertEquals("Password@1", service.getProperty());
////
////        Environment environment = appCtx.getBean(Environment.class);
////
////        assertEquals(
////                "Password@1",
////                service.getPasswordUsingEnvironment(environment));
////    }
//
//    @Test
//    public void test() {
//        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
//        String privateData = "root";
//        textEncryptor.setPasswordCharArray("jrklnjflkeu9u5qo3r".toCharArray());
////        textEncryptor.setPassword("root");
////        System.out.println(textEncryptor.encrypt("root"));
//        String myEncryptedText = textEncryptor.encrypt(privateData);
//        System.out.println("加密后：" + myEncryptedText);
//        assertNotSame(privateData, myEncryptedText);
//
//        String plainText = textEncryptor.decrypt(myEncryptedText);
//        System.out.println("解密后：" + plainText);
//        assertEquals(plainText, privateData);
//
//
//        String password = "secret-pass";
//        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
//        String encryptedPassword = passwordEncryptor.encryptPassword(password);
//        System.out.println(encryptedPassword);
//
//
//    }
//}