package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author weat0212@gmail.com
 * @project spring-mvc-demo
 * @package com.example.mvc
 * @date 2020/10/22 下午 04:01
 */

@Controller
public class HelloMVCController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model){
        model.addAttribute("msg", "Spring MVC Hello World");
        return "index";
    }
}
