# Spring-boot-config 模块

## 1. SpringBoot 启动 banner 配置

>> resources 目录下的 banner.txt 是自定义的 SpringBoot 应用启动图标文件

 在线 ASCII 艺术字生成网站 [URL](https://www.fontke.com/tool/image2ascii/)
 
## 2. application.properties

>> 属性定义时候出现波浪线："Cannot resolve configuration property" 可以使用SpringBoot 的 configuration processor 模块来解决问题

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```

然后在配置类上添加 @ConfigurationProperties 注解即可

## 3. Tomcat的相关配置

参考文档 [URL](https://www.cnblogs.com/chenpi/p/9696371.html)
    
## 4. HTTPS 的配置

## 5. 在配置文件中自定义配置属性

- 定义
- 读取
