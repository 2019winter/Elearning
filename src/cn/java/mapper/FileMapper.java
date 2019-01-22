package cn.java.mapper;

import cn.java.entity.File;
import org.springframework.stereotype.Repository;

/**
 * FileMapper继承基类
 */
@Repository
public interface FileMapper extends MyBatisBaseDao<File, Integer> {
}