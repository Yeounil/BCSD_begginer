package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/helloBody", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        System.out.println("/helloBody");
        return "hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello2(){
        System.out.println("/hello");
        return "hello";
    }
}
