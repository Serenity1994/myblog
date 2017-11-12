package com.myblog.dao.impl;

import com.myblog.dao.IBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * @author serenity
 * @date 17-11-11 14:05
 */
@Component
@Transactional
public class BaseDaoImpl<Entity, PK extends Serializable> implements IBaseDao<Entity, PK> {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public Serializable save(Object entity) throws DataAccessException {
        return hibernateTemplate.save(entity);
    }

    @Override
    public void update(Object entity) throws DataAccessException {
        hibernateTemplate.update(entity);
    }
}
