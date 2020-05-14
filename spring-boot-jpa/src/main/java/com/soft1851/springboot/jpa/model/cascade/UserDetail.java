package com.soft1851.springboot.jpa.model.cascade;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xunmi
 * @ClassName UserDetail
 * @Description TODO
 * @Date 2020/5/14
 * @Version 1.0
 **/
@Entity
@Data
public class UserDetail {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private Long userId;
    private Integer age;
    private String realName;
    private String status;
    private String hobby;
    private String introduction;
    private String lastLoginIp;
}
