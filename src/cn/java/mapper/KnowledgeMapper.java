package cn.java.mapper;

import cn.java.entity.Knowledge;
import org.springframework.stereotype.Repository;

/**
 * KnowledgeMapper继承基类
 */
@Repository
public interface KnowledgeMapper extends MyBatisBaseDao<Knowledge, Integer> {
}