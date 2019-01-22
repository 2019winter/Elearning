package cn.java.mapper;

import cn.java.entity.Course;
import org.springframework.stereotype.Repository;

/**
 * CourseMapper继承基类
 */
@Repository
public interface CourseMapper extends MyBatisBaseDao<Course, Integer> {
}