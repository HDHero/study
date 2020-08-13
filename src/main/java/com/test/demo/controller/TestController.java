package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestController {

    //@RequestMapping("/index")
    @RequestMapping("/my_template")
    public String testFreeMarker(Model model){
        System.out.println("hello");
        model.addAttribute("welcome","hello remous");
        return "my_template";
    }
}
