package com.kfgs.firstweb.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.firstweb.service.UploadService;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/upload")
public class UploadController {
    @Reference
    private UploadService uploadService;

    @PostMapping(value = "save", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String save(@RequestBody Map pData) {
        String returnBack = "";
        System.out.println(pData.get("type").toString());
        /*if(StringUtils.equals(pData.get("type").toString(), "公告")){
            int returnStr = uploadService.updateByExampleSelective(pData);
        }else  if(StringUtils.equals(pData.get("type").toString(), "政策")){
            int returnStr = uploadService.updateByExampleSelective(pData);
        }*/
        int returnStr = uploadService.updateByExampleSelective(pData);

        return returnBack;
    }

    @PostMapping("/getContent")
    public Map<String,Object> getContent(@RequestBody Map pData){
        return uploadService.selectByPrimaryKey(pData);
    }

    /*@PostMapping(value = "insert", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public void insert(@RequestBody Map pData){
        System.out.println(pData.get("title").toString());
        uploadService.insertByExampleSelective(pData);
    }*/
}
