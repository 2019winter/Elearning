package cn.java.mapper;

import cn.java.entity.Prefer;
import cn.java.entity.PreferKey;
import org.springframework.stereotype.Repository;

/**
 * PreferMapper继承基类
 */
@Repository
public interface PreferMapper extends MyBatisBaseDao<Prefer, PreferKey> {
}