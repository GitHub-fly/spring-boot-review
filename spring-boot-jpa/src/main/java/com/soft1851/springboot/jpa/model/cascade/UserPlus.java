package com.soft1851.springboot.jpa.model.cascade;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xunmi
 * @ClassName UserPlus
 * @Description TODO
 * @Date 2020/5/13
 * @Version 1.0
 **/
@Entity
@Data
public class UserPlus {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int age;

}
