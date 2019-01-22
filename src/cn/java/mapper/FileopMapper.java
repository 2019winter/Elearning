package cn.java.mapper;

import cn.java.entity.Fileop;
import org.springframework.stereotype.Repository;

/**
 * FileopMapper继承基类
 */
@Repository
public interface FileopMapper extends MyBatisBaseDao<Fileop, Integer> {
}