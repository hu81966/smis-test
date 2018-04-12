package com.hjc.service.impl;

import com.hjc.dao.UserDao;
import com.hjc.entity.User;
import com.hjc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource(name="userDao")
    private UserDao userDao;

    @Override
    public void test() {
        System.out.println("测试Spring");
    }

    @Override
    public User SelectPwdById(String id) {
        return userDao.selectById(id);
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
