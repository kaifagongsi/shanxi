package com.kfgs.domain.response;

import com.kfgs.model.response.QueryResponseResult;
import com.kfgs.model.response.QueryResult;
import com.kfgs.model.response.ResponseResult;
import com.kfgs.model.response.ResultCode;

/**
 * <H3>shanxi</H3>
 * <p>产品返回列表</p>
 *
 * @author : 你的名字
 * @date : 2019-12-03 14:51
 */
public class TbProductQueryResponseResult extends QueryResponseResult {



    public TbProductQueryResponseResult(ResultCode resultCode, QueryResult queryResult) {
        super(resultCode, queryResult);
    }
}
