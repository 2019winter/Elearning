package cn.java.mapper;

import cn.java.entity.Note;
import org.springframework.stereotype.Repository;

/**
 * NoteMapper继承基类
 */
@Repository
public interface NoteMapper extends MyBatisBaseDao<Note, Integer> {
}