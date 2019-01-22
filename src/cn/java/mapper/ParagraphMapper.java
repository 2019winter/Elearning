package cn.java.mapper;

import cn.java.entity.Paragraph;
import org.springframework.stereotype.Repository;

/**
 * ParagraphMapper继承基类
 */
@Repository
public interface ParagraphMapper extends MyBatisBaseDao<Paragraph, Integer> {
}