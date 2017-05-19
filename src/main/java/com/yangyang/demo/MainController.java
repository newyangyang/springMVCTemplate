package com.yangyang.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "testpage", method = RequestMethod.GET)
    public String testPage(ModelMap map) {
        map.put("message", "this is message");
        return "testpage";
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public Object test(@RequestBody HelloRequest request) {
        return helloService.hello(request.getName());
    }

}

class HelloRequest{
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

