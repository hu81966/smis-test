package com.hjc.action;

import com.hjc.entity.User;
import com.hjc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
public class UserAction extends ActionSupport{

    @Resource(name = "userService")
    private UserService userService;

    public void test() {
        System.out.println("进入了Action");
        String id = "级八春";
        User u = userService.SelectPwdById(id);
        System.out.println("pwd:" + u.getPwd());
    }
}
