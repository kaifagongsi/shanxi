package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfgs.domain.TbAdministrativeArea;
import com.kfgs.domain.TbAdministrativeAreaExample;
import com.kfgs.mapper.TbAdministrativeAreaMapper;
import com.kfgs.model.response.CommonCode;
import com.kfgs.model.response.QueryResponseResult;
import com.kfgs.model.response.QueryResult;
import com.kfgs.statistics.service.AdministrativeAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <H3>shanxi</H3>
 * <p>获取地区</p>
 *
 * @author : 你的名字
 * @date : 2019-12-02 15:27
 */
@Service(timeout = 1200000)
@Transactional
public class AdministrativeAreaServiceImpl implements AdministrativeAreaService {


    @Autowired
    TbAdministrativeAreaMapper tbAdministrativeAreaMapper;

    @Override
    public QueryResponseResult findAll() {
        List<TbAdministrativeArea> administrativeAreas = tbAdministrativeAreaMapper.selectByExample(null);
        QueryResult queryResult = new QueryResult();
        queryResult.setList(administrativeAreas);
        return new QueryResponseResult(CommonCode.SUCCESS, queryResult);
    }

    /**
     * @param parentId 父类id
     * @return
     */
    @Override
    public QueryResponseResult findListByParentId(String parentId) {
        TbAdministrativeAreaExample selectByExample = new TbAdministrativeAreaExample();
        TbAdministrativeAreaExample.Criteria criteria = selectByExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbAdministrativeArea> list = tbAdministrativeAreaMapper.selectByExample(selectByExample);
        QueryResult queryResult = new QueryResult();
        queryResult.setList(list);
        return new QueryResponseResult(CommonCode.SUCCESS, queryResult);
    }

    @Override
    public List<TbAdministrativeArea> findListLikePath(String path) {
        return null;
    }


}
