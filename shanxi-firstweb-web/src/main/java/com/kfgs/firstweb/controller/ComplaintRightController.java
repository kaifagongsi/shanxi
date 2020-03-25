package com.kfgs.firstweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.firstweb.service.ComplaintRightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/complaintRight")
public class ComplaintRightController {

    @Reference
    private ComplaintRightService complaintRightService;

    @PostMapping("/getList")
    public Map<String,Object> getList(@RequestBody Map searchMap){
        return complaintRightService.getList(searchMap);
    }
}
