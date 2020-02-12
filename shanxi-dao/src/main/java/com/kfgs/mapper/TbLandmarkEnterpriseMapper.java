package com.kfgs.mapper;

import com.kfgs.domain.TbLandmarkEnterprise;
import com.kfgs.domain.TbLandmarkEnterpriseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbLandmarkEnterpriseMapper {
    int countByExample(TbLandmarkEnterpriseExample example);

    int deleteByExample(TbLandmarkEnterpriseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLandmarkEnterprise record);

    int insertSelective(TbLandmarkEnterprise record);

    List<TbLandmarkEnterprise> selectByExample(TbLandmarkEnterpriseExample example);

    TbLandmarkEnterprise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLandmarkEnterprise record, @Param("example") TbLandmarkEnterpriseExample example);

    int updateByExample(@Param("record") TbLandmarkEnterprise record, @Param("example") TbLandmarkEnterpriseExample example);

    int updateByPrimaryKeySelective(TbLandmarkEnterprise record);

    int updateByPrimaryKey(TbLandmarkEnterprise record);

    //柱状图
    List<Map> selectHistogramByProEnt(@Param("year")String year, @Param("classification") String classification, @Param("parentId")String parentId);

    //获取面积饼图数据
    List<Map> selectPieAreaEnt(@Param("year")String year,@Param("classification") String classification,@Param("parentId")String parentId);

    //折线图数据
    List<Map> selectLineChartByYear(@Param("classification") String classification, @Param("parentId") String parentId);
}