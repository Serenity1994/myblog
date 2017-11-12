package com.myblog.dao;

import org.springframework.dao.DataAccessException;

import java.io.Serializable;
import java.util.List;

/**
 * 通用数据层接口
 *
 * @author serenity
 * @date 17-11-11 13:43
 */
public interface IBaseDao<Entity> {
    /**
     * 保存
     * @param entity 实体类
     * @return 主键
     */
    Serializable save(Object entity) throws DataAccessException;

    void update(Object entity) throws DataAccessException;

    List<Entity> loadAll() ;
}
