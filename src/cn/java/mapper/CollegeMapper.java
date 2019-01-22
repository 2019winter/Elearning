package cn.java.mapper;

import cn.java.entity.College;
import org.springframework.stereotype.Repository;

/**
 * CollegeMapper继承基类
 */
@Repository
public interface CollegeMapper extends MyBatisBaseDao<College, Integer> {
}