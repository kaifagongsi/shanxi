package com.kfgs.firstweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.domain.TbComplaintsAboutRightsProtection;
import com.kfgs.domain.TbComplaintsAboutRightsProtectionExample;
import com.kfgs.firstweb.service.ComplaintRightService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
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

    @PostMapping(value = "save", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String save(@RequestBody Map pData) {
        String returnBack = "";
        System.out.println(pData.get("object").toString());
        int returnStr = complaintRightService.insertByExample(pData);
        return returnBack;
    }

}
