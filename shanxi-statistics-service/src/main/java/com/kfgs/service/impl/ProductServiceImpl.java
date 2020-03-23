package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfgs.mapper.TbProductMapper;
import com.kfgs.model.response.CommonCode;
import com.kfgs.model.response.QueryResponseResult;
import com.kfgs.model.response.QueryResult;
import com.kfgs.statistics.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Date: 2019-12-04-19-37
 * <p>Module:</p>
 * <p>Description:</p>
 *
 * @author:
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    TbProductMapper tbProductMapper;

    @Override
    public QueryResponseResult selectByDistinctApprovalYear() {
        List<String> list = tbProductMapper.selectDistinctProductApprovalYear();
        QueryResult queryResult = new QueryResult();
        queryResult.setList(list);
        return new QueryResponseResult(CommonCode.SUCCESS,queryResult);
    }
}
