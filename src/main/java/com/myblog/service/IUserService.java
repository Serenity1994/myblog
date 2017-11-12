package com.myblog.service;

import com.myblog.entity.pojo.User;

import java.io.Serializable;
import java.util.List;

/**
 * @author serenity
 * @date 17-11-11 15:55
 */
public interface IUserService {
    /**
     * 保存
     * @param user user
     */
    Serializable save(User user);

    List<User> loadAll();
}
