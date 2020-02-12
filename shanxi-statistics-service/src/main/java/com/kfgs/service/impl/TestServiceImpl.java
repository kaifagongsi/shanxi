package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfgs.domain.TbProduct;
import com.kfgs.domain.TbProductExample;
import com.kfgs.mapper.TbProductMapper;
import com.kfgs.model.response.QueryResponseResult;
import com.kfgs.statistics.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Date: 2019-12-09-17-52
 * <p>Module:</p>
 * <p>Description:</p>
 *
 * @author:
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TbProductMapper tbProductMapper;


    @Override
    public QueryResponseResult Test() {
        TbProductExample example = new TbProductExample();
        example.createCriteria().andNameEqualTo("甘泉红小豆");
        List<TbProduct> products = tbProductMapper.selectByExample(example);
        System.out.println(products.size());
        return null;
    }
}
