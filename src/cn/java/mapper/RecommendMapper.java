package cn.java.mapper;

import cn.java.entity.Recommend;
import org.springframework.stereotype.Repository;

/**
 * RecommendMapper继承基类
 */
@Repository
public interface RecommendMapper extends MyBatisBaseDao<Recommend, Integer> {
}