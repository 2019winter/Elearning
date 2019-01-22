package cn.java.mapper;

import cn.java.entity.Major;
import org.springframework.stereotype.Repository;

/**
 * MajorMapper继承基类
 */
@Repository
public interface MajorMapper extends MyBatisBaseDao<Major, Integer> {
}