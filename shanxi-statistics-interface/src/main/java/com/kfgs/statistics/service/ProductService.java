package com.kfgs.statistics.service;

import com.kfgs.model.response.QueryResponseResult;

import java.util.Map;

/**
 * 产品service
 */
public interface ProductService {

    public QueryResponseResult selectByDistinctApprovalYear();

    public Map<String,Object> getList(Map searchMap);
}
