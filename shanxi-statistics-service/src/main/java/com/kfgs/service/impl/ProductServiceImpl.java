package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kfgs.domain.TbProductExample;
import com.kfgs.domain.ext.TbProductExt;
import com.kfgs.mapper.TbProductMapper;
import com.kfgs.model.response.CommonCode;
import com.kfgs.model.response.QueryResponseResult;
import com.kfgs.model.response.QueryResult;
import com.kfgs.statistics.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Date: 2019-12-04-19-37
 * <p>Module:</p>
 * <p>Description:</p>
 *
 * @author:
 */
@Service(timeout = 1200000)
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

    @Override
    public Map getList(Map searchMap){
        PageHelper.startPage(Integer.parseInt(searchMap.get("pageNo").toString()),15);
        //返回页面结果集
        Map mapResult = new HashMap();
        TbProductExample slectExample = new TbProductExample();
        slectExample.createCriteria().andIsdeleteEqualTo(0);
        slectExample.setOrderByClause("  create_time desc  ");
        Page<TbProductExt> page = (Page<TbProductExt>) tbProductMapper.getList(slectExample);
        System.out.println(page.getTotal());
        mapResult.put("rows",page.getResult());
        mapResult.put("totalPages", page.getPages());
        mapResult.put("total",page.getTotal());
        return mapResult;
    }
}
