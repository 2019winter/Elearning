package cn.java.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:ChenYanyu Date:15:35 2019/1/22
 */

@Controller
public class TestController {
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





}
