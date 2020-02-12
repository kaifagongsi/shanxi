package com.kfgs.statistics.service;

import com.kfgs.model.response.QueryResponseResult;

/**
 * 产品service
 */
public interface ProductService {

    public QueryResponseResult selectByDistinctApprovalYear();
}
