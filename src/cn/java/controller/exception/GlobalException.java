package cn.java.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * author:ChenYanyu Date:14:56 2019/1/22
 */
// 配置全局异常处理
@ControllerAdvice
public class GlobalException {
  @ExceptionHandler(Exception.class)
  public String globalHandler(Exception e){
    e.printStackTrace();//打印错误信息
    return "front/globalException.jsp";
  }
}
