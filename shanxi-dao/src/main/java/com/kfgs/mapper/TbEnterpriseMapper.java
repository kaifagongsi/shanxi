package com.kfgs.mapper;

import com.kfgs.domain.TbEnterprise;
import com.kfgs.domain.TbEnterpriseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbEnterpriseMapper {
    int countByExample(TbEnterpriseExample example);

    int deleteByExample(TbEnterpriseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEnterprise record);

    int insertSelective(TbEnterprise record);

    List<TbEnterprise> selectByExample(TbEnterpriseExample example);

    TbEnterprise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEnterprise record, @Param("example") TbEnterpriseExample example);

    int updateByExample(@Param("record") TbEnterprise record, @Param("example") TbEnterpriseExample example);

    int updateByPrimaryKeySelective(TbEnterprise record);

    int updateByPrimaryKey(TbEnterprise record);
}