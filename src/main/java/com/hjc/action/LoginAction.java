package com.hjc.action;

import com.hjc.entity.User;
import com.hjc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Administrator
 */
public class LoginAction extends ActionSupport{

    @Autowired
    private UserService userService;

    private User user;

    public String portal() {
        return "page";
    }

    public String login() {
        user = userService.login(user);
        if (user != null && StringUtils.isNotEmpty(user.getName())) {
            return SUCCESS;
        } else {
            return "page";
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
