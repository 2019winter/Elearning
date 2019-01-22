package cn.java.mapper;

import cn.java.entity.Collection;
import org.springframework.stereotype.Repository;

/**
 * CollectionMapper继承基类
 */
@Repository
public interface CollectionMapper extends MyBatisBaseDao<Collection, Integer> {
}