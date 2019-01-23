package cn.java.service.impl;

import cn.java.entity.Course;
import cn.java.mapper.CourseMapper;
import cn.java.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:ChenYanyu Date:14:23 2019/1/23
 */
// 加上注解，表示是Service层的
@Service
public class CourseServiceImpl implements CourseService {

  // 这里手写
  // 使用依赖注入
  @Autowired
  private CourseMapper cm;


  @Override
  public int deleteByPrimaryKey(Integer id) {
    return 0;
  }

  @Override
  public int insert(Course record) {
    return 0;
  }

  @Override
  public int insertSelective(Course record) {
    return 0;
  }

  /*
   * 功能描述:测试一下这个
   * 输入:主键id
   * 返回:一条记录
   * @author 陈彦宇
   * @date 2019/1/23 14:29
   */
  @Override
  public Course selectByPrimaryKey(Integer id) {
    //业务层Service 调用 dao层接口（cm是dao层的对象，由cm去调用），dao层去和数据库打交道
    //再返回
    return cm.selectByPrimaryKey(id);
  }

  @Override
  public int updateByPrimaryKeySelective(Course record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKeyWithBLOBs(Course record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(Course record) {
    return 0;
  }
}
