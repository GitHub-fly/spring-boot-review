package com.soft1851.springboot.schedule.repository;

import com.soft1851.springboot.schedule.model.Cron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xunmi
 * @ClassName CronRepository
 * @Description TODO
 * @Date 2020/5/16
 * @Version 1.0
 **/
public interface CronRepository extends JpaRepository<Cron, Integer> {

    /**
     * 根据 cronId 查询
     *
     * @param cronId
     * @return
     */
    Cron findCronByCronIdEquals(int cronId);

    /**
     * 根据 id 修改 cron
     *
     * @param cron
     * @param id
     */
    @Modifying
    @Transactional(rollbackFor = RuntimeException.class)
    @Query(value = "update cron set cron = ?1 where cron_id = ?2", nativeQuery = true)
    void updateCron(String cron, int id);
}
