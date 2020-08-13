package com.test.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remous")
public class InterceptRestController {

    @RequestMapping(path = "/test01",method = RequestMethod.POST)
    public void test01(){
        System.out.println("this is for test01");
    }

    @RequestMapping(path = "/test02",method = RequestMethod.POST)
    public void test02(){
        System.out.println("this is for test02");
    }

}
