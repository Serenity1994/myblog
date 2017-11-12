package com.myblog.service;

import com.myblog.entity.pojo.User;

import java.io.Serializable;

/**
 * @author serenity
 * @date 17-11-11 15:55
 */
public interface IUserService {
    /**
     * 保存
     * @param user
     */
    Serializable save(User user);
}
