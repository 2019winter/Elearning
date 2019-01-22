package cn.java.mapper;

import cn.java.entity.Action;
import org.springframework.stereotype.Repository;

/**
 * ActionMapper继承基类
 */
@Repository
public interface ActionMapper extends MyBatisBaseDao<Action, Integer> {
}