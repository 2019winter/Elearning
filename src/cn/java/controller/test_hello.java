package cn.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test_hello {
    @RequestMapping(value="/test_hello")
    public String inputProduct(Model model){
        
        return "front/test-helloword.jsp";
    }
}
