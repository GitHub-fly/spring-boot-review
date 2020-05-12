package com.soft1851.springboot.jpa.dao;

import com.soft1851.springboot.jpa.model.cascade.User;
import com.soft1851.springboot.jpa.model.cascade.UserPlus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xunmi
 * @ClassName UserPlusRepository
 * @Description TODO
 * @Date 2020/5/13
 * @Version 1.0
 **/
public interface UserPlusRepository extends JpaRepository<UserPlus, Long> {

    /**
     * 查询方法
     * @param userName
     * @return
     */
    UserPlus findByUserName(String userName);
}
