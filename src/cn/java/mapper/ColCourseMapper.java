package cn.java.mapper;

import cn.java.entity.ColCourse;
import cn.java.entity.ColCourseKey;
import org.springframework.stereotype.Repository;

/**
 * ColCourseMapper继承基类
 */
@Repository
public interface ColCourseMapper extends MyBatisBaseDao<ColCourse, ColCourseKey> {
}