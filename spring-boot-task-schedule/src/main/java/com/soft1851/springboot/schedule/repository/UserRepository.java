package com.soft1851.springboot.schedule.repository;

import com.soft1851.springboot.schedule.model.UserMail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author xunmi
 * @ClassName UserRepository
 * @Description TODO
 * @Date 2020/5/16
 * @Version 1.0
 **/
public interface UserRepository extends JpaRepository<UserMail,Long> {
    /**
     * 查找当天过生日的用户
     * @return
     */
    @Query(value = "SELECT * FROM user_mail WHERE MONTH(birthday) = MONTH(NOW()) AND DAY(birthday) = DAY(NOW())",nativeQuery = true)
    List<UserMail> findUsersByBirthday();
}

