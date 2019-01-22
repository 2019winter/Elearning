package cn.java.mapper;

import cn.java.entity.Preference;
import org.springframework.stereotype.Repository;

/**
 * PreferenceMapper继承基类
 */
@Repository
public interface PreferenceMapper extends MyBatisBaseDao<Preference, Integer> {
}