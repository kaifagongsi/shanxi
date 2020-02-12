package com.kfgs.statistics.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kfgs.model.response.QueryResponseResult;
import com.kfgs.statistics.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2019-12-04-19-39
 * <p>Module:</p>
 * <p>Description:</p>
 *
 * @author:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Reference
    private ProductService productService;

    @GetMapping("/selectAllApprovalYeat")
    public QueryResponseResult selectAllApprovalYeat(){
        System.out.println("11111111111111111111111");
        return  productService.selectByDistinctApprovalYear();
    }
}
