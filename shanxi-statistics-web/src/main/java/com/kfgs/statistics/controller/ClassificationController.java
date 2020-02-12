package com.kfgs.statistics.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.statistics.service.ClassificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date: 2019-12-04-20-01
 * <p>Module:</p>
 * <p>Description:</p>
 *
 * @author:
 */
@RestController
@RequestMapping("/classification")
public class ClassificationController {

    @Reference
    ClassificationService classificationService;

    @GetMapping("/getFirstClassification")
    public List getFirstClassification(){
        return classificationService.getFirstClassification();
    }
}
