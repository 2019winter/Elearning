package cn.java.mapper;

import cn.java.entity.Boardcast;
import org.springframework.stereotype.Repository;

/**
 * BoardcastMapper继承基类
 */
@Repository
public interface BoardcastMapper extends MyBatisBaseDao<Boardcast, Integer> {
}