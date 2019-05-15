package com.jk.service;

import com.jk.mapper.MainMapper;
import com.jk.model.AreaBean;
import com.jk.model.DeptBean;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("mainService")//与spring-dubbo-provider.xml中ref mainService的对应
public class MainServiceImpl  implements MainService {
    @Autowired
    private MainMapper mainMapper;
    @Override
    public HashMap<String, Object> selectMain(Integer page, Integer rows, UserBean userBean) {
        HashMap<String,Object> hashMap = new HashMap<>();
        //查询总条数
        Integer total=mainMapper.selectCount(userBean);
        //开始位置
        int start= (page-1)*rows;
        List<UserBean> list=mainMapper.selectPage(start,rows,userBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);

        return hashMap;
    }

    @Override
    public void delMainByIds(Integer[] ids) {

    }

    @Override
    public List<DeptBean> toDept(Integer id) {
        return null;
    }

    @Override
    public List<AreaBean> toArea(Integer id) {
        return null;
    }

    @Override
    public void addOrUpdate(UserBean userBean) {

    }

    @Override
    public void addOrUpdate2(UserBean userBean) {

    }

    @Override
    public UserBean huiX(Integer id) {
        return null;
    }
}
