package com.soft1851.springboot.schedule.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author xunmi
 * @ClassName Coder
 * @Description TODO
 * @Date 2020/5/18
 * @Version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Coder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",nullable = false,length = 50)
    private String name;

    @Column(name = "avatar",nullable = false,length = 255)
    private String avatar;

    @Column(name = "url",nullable = false,length = 255)
    private String url;
}