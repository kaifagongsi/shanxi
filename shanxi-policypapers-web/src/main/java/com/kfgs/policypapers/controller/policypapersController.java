package com.kfgs.policypapers.controller;


import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.domain.TbPolicyDocument;
import com.kfgs.policypapers.service.policypapersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/policypapers")
public class policypapersController {

    @Reference
    private policypapersService policypapersService;

    @GetMapping("/search")
    public Map<String,List<TbPolicyDocument>> text(){
        System.out.println("--------------------------");
        return policypapersService.getList();
    }



    @PostMapping("/getList")
    public Map<String,Object> getList(@RequestBody Map searchMap){
        return policypapersService.getList(searchMap);
    }


    @PostMapping(value = "save", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String save(@RequestBody Map pData) {
        int returnStr = policypapersService.updateByExampleSelective(pData);
        JSONObject ja = new JSONObject();
        ja.put("isSuccess", returnStr);
        ja.put("loadType", "受理公告");
        return "success";
    }

    @PostMapping("/getContent")
    public Map<String,Object> getContent(@RequestBody Map pData){
        return policypapersService.selectByPrimaryKey(pData);
    }
}
