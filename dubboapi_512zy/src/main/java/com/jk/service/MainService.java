package com.jk.service;


import com.jk.model.AreaBean;
import com.jk.model.DeptBean;
import com.jk.model.RoleBean;
import com.jk.model.TreeBean;
import com.jk.model.UserBean;

import java.util.HashMap;
import java.util.List;

public interface MainService {
    HashMap<String, Object> selectMain(Integer page, Integer rows, UserBean userBean);

    void delMainByIds(Integer[] ids);

    List<DeptBean> toDept(Integer id);

    List<AreaBean> toArea(Integer id);

    void addOrUpdate(UserBean userBean);

    void addOrUpdate2(UserBean userBean);

    UserBean huiX(Integer id);

}
