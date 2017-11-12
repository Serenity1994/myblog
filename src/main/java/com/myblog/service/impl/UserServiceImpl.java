package com.myblog.service.impl;

import com.myblog.dao.IUserDao;
import com.myblog.entity.pojo.User;
import com.myblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author serenity
 * @date 17-11-11 16:22
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDao iUserDao;

    @Override
    public Serializable save(User user) {
        return iUserDao.save(user);
    }
}
