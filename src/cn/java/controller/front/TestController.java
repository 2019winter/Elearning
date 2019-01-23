package cn.java.controller.front;

import cn.java.entity.Course;
import cn.java.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:ChenYanyu Date:15:35 2019/1/22
 */

@Controller
public class TestController {

  //使用依赖注入
  //Controller拥有一个Service层的对象，使用Service提供的服务
  @Autowired
  private CourseService ps;

  @RequestMapping(value="/test_hello")
  public String inputProduct(Model model){
    // 测试通过
    return "front/test-helloword.jsp";
  }

  @RequestMapping(value = "/test_Exception")
  public void exceptionTest(){
    int i = 10 / 0;
    // 测试错误处理
    // 测试通过
  }

  //把Course变成json

  @RequestMapping(value = "get_course")
  @ResponseBody
  public Course getCourseById(Integer id){
    return ps.selectByPrimaryKey(id);

  }





}
