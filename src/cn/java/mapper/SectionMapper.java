package cn.java.mapper;

import cn.java.entity.Section;
import org.springframework.stereotype.Repository;

/**
 * SectionMapper继承基类
 */
@Repository
public interface SectionMapper extends MyBatisBaseDao<Section, Integer> {
}