package cn.java.mapper;

import cn.java.entity.Message;
import org.springframework.stereotype.Repository;

/**
 * MessageMapper继承基类
 */
@Repository
public interface MessageMapper extends MyBatisBaseDao<Message, Integer> {
}