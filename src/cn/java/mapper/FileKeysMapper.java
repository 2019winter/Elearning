package cn.java.mapper;

import cn.java.entity.FileKeys;
import org.springframework.stereotype.Repository;

/**
 * FileKeysMapper继承基类
 */
@Repository
public interface FileKeysMapper extends MyBatisBaseDao<FileKeys, Integer> {
}