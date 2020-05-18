package com.soft1851.springboot.schedule.repository;

import com.soft1851.springboot.schedule.model.Coder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xunmi
 * @ClassName CodeRepository
 * @Description TODO
 * @Date 2020/5/18
 * @Version 1.0
 **/
public interface CoderRepository extends JpaRepository<Coder, Integer> {
}
