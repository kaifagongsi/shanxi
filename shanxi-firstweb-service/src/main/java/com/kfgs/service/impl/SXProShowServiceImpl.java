package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfgs.domain.TbClassification;
import com.kfgs.domain.TbClassificationExample;
import com.kfgs.firstweb.service.SXProShowService;
import com.kfgs.mapper.TbClassificationMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Service(timeout = 120000)
public class SXProShowServiceImpl implements SXProShowService {

    @Autowired
    TbClassificationMapper tbClassificationMapper;

    @Override
    public List getList(){
        //返回页面结果集
        TbClassificationExample tbClassificationExample = new TbClassificationExample();
        tbClassificationExample.createCriteria().andParentidEqualTo("0000");
        List<TbClassification> list = tbClassificationMapper.selectByExample(tbClassificationExample);
        return list;
    }

    /*@Override
    public List getStrList(){
        //返回类别结果集
        TbClassificationExample tbClassificationExample = new TbClassificationExample();
        tbClassificationExample.createCriteria().andParentidEqualTo("0000");
        List<TbClassification> list = tbClassificationMapper.selectByExample(tbClassificationExample);

            List<String> typelist = new ArrayList<>();
            for(TbClassification xx : list){
                typelist.add(xx.getName());
            }
        return typelist;

    }*/

    @Override
    public Map<String,Object> search(){

        return  getType();


    }

    private Map getType() {
        List listId = new ArrayList();
        List nameList = new ArrayList();
        //返回页面结果集
        Map<String,Object> map = new HashMap<>();
        //按照类别提供数据集
        Map<String,List<TbClassification>> typeMap = new HashMap<String,List<TbClassification>>();

        TbClassificationExample tbClassificationExample = new TbClassificationExample();
        tbClassificationExample.createCriteria().andParentidEqualTo("0000");
        List<TbClassification> list = tbClassificationMapper.selectByExample(null);

        if (list != null && list.size()>0){
            for(TbClassification temp:list){
                //判断父节点创建类别Map
                if(temp.getRootid().equals("1") || temp.getRootid() == "1"){
                    List<TbClassification> list_father = new ArrayList<>();
                    String idAndName = temp.getClassificationid().concat(temp.getName());
                    //typeMap.put(idAndName,list_father);
                    typeMap.put(temp.getClassificationid(),list_father);
                }
            }
            for(TbClassification son:list){
                //创建子节点
                if (son.getRootid().equals("2")){
                    List<TbClassification> list_son = new ArrayList<>();
                    if(typeMap.containsKey(son.getParentid())){
                        list_son = typeMap.get(son.getParentid());
                        list_son.add(son);
                    }
                }
            }
        }

        //新建map
        Map<String,List<TbClassification>> newtypeMap = new HashMap<String,List<TbClassification>>();
        //List<Map<String,List<TbClassification>>> newtypeList= new ArrayList<>();
        Iterator it = typeMap.keySet().iterator();
        while (it.hasNext()){
           // Map<String,List<TbClassification>> newtypeMap = new HashMap<String,List<TbClassification>>();
            //取出key
            String key = it.next().toString();
            String id = "";
            String name="";
            String idAndName="";
            System.out.println(key);
            //取出value
            List<TbClassification> newlist = new ArrayList<>();
            newlist = typeMap.get(key);

            //根据key（id）获取name
            TbClassificationExample tbClassificationExample1 = new TbClassificationExample();
            tbClassificationExample1.createCriteria().andClassificationidEqualTo(key);
            List<TbClassification> list1 = tbClassificationMapper.selectByExample(tbClassificationExample1);
            for(TbClassification fa:list1){
                id = fa.getClassificationid();
                name = fa.getName();
                idAndName = id.concat(name);
                /*nameList.add(name);
                listId.add(fa.getClassificationid());*/
            }
            newtypeMap.put(idAndName,newlist);
            //newtypeList.add(newtypeMap);
        }
        //map.put("type",typeMap);
        map.put("type",newtypeMap);
        /*map.put("list",listId);
        map.put("listName",nameList);*/
        return map;
    }

}
