package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    //查询主表(UserBean)
    @RequestMapping("selectMain")
    @ResponseBody
    public HashMap<String,Object> selectMain(Integer rows, Integer page, UserBean userBean){
        return mainService.selectMain(page,rows,userBean);
    }

}
