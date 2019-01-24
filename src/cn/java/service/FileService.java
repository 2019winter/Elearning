package cn.java.service;

import cn.java.entity.File;
import org.springframework.stereotype.Repository;
// import org.springframework.ui.Model;

/**
 * CourseMapper继承基类
 */
/*
 * 功能描述:可以从Mapper复制过来，因为方法名称是一样的，
 * 把CourseMapper改成CourseService,再改改就行
 * 这是个一个测试范例
 * @author 陈彦宇
 * @date 2019/1/23 14:30
 */
@Repository
public interface FileService {
  int deleteByPrimaryKey(Integer id);

  int insert(File record);

  int insertSelective(File record);

  File selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(File record);

  int updateByPrimaryKeyWithBLOBs(File record);

  int updateByPrimaryKey(File record);
}