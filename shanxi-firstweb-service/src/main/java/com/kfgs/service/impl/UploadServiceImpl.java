package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfgs.domain.TbProductShow;
import com.kfgs.domain.TbProductShowExample;
import com.kfgs.firstweb.service.UploadService;
import com.kfgs.mapper.TbProductShowMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(timeout = 120000)
public class UploadServiceImpl implements UploadService {

    @Autowired
    TbProductShowMapper tbProductShowMapper;

    @Override
    public int updateByExampleSelective(Map pData){
        TbProductShow record = new TbProductShow();
        record.setContent(pData.get("content").toString().getBytes());
        TbProductShowExample selectExample = new TbProductShowExample();
        selectExample.createCriteria().andTitleEqualTo(pData.get("title").toString());
        int returnResult = tbProductShowMapper.updateByExampleSelective(record, selectExample);
        return returnResult;
    }

    /*@Override
    public void insertByExample(Map pData) {
        Map<String,Object> map = new HashMap<>();
        TbProductShowExample tbProductShowExample = new TbProductShowExample();
        TbProductShow record = new TbProductShow();
        record.setContent(pData.get("content").toString().getBytes());
        //record.setCreateTime(pData.get("time"));

    }*/

    @Override
    public Map<String,Object> selectByPrimaryKey(Map pData){
        Map<String,Object> map = new HashMap<>();
        TbProductShowExample tbProductShowExample = new TbProductShowExample();
        tbProductShowExample.createCriteria().andIdEqualTo(Integer.parseInt(pData.get("id").toString())).andTitleEqualTo(pData.get("title").toString());
        List<TbProductShow> model = tbProductShowMapper.selectByExampleWithBLOBs(tbProductShowExample);
        if (model !=null && model.size()== 1) {
            for (TbProductShow xx : model) {
                if(xx.getContent() == null){
                    System.out.println("content 为空");
                }else {
                    System.out.println("=============" + new String(xx.getContent()));
                    map.put("content", new String(xx.getContent()));
                }
            }
        }else if(model == null){
            map.put("content","相关资料等待上传中...");
        }
        /*TbProductShow model = tbProductShowMapper.selectByPrimaryKey(Integer.parseInt(pData.get("id").toString()));
        System.out.println("=============" +  new String(model.getContent()));
        map.put("content",new String(model.getContent()));*/
        return map;
    }


}
