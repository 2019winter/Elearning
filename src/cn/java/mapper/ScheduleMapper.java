package cn.java.mapper;

import cn.java.entity.Schedule;
import cn.java.entity.ScheduleKey;
import org.springframework.stereotype.Repository;

/**
 * ScheduleMapper继承基类
 */
@Repository
public interface ScheduleMapper extends MyBatisBaseDao<Schedule, ScheduleKey> {
}