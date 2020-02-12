package com.kfgs.firstweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.firstweb.service.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test_lsy")
public class TestController {

    @Reference
    Test test;
    @RequestMapping("/tt")
    public String test(){
        System.out.println("111111111111");
        return  test.test();
    }
}
