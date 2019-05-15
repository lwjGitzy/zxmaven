package com.jk.mapper;

import com.jk.model.UserBean;

import java.util.List;

public interface MainMapper {
    Integer selectCount(UserBean userBean);

    List<UserBean> selectPage(int start, Integer rows, UserBean userBean);
}
