package com.myblog.dao.impl;

import com.myblog.dao.IBaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author serenity
 * @date 17-11-11 14:05
 */
@Transactional
public class BaseDaoImpl<Entity> implements IBaseDao<Entity> {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    private Class<Entity> entityClass;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public BaseDaoImpl() {
//        Class clazz = this.getClass();
//        Type type1 = clazz.getGenericSuperclass();
//        ParameterizedType type = (ParameterizedType) type1;
//        logger.info(">>>>>>>>>>>>>>>>>>{}",type.getActualTypeArguments().toString());
//        logger.info(">>>>>>>>>>>>>>>>>>{}",type.getActualTypeArguments()[0].toString());
//        this.entityClass = (Class<Entity>) type.getActualTypeArguments()[0];
//        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
//        this.entityClass = (Class<Entity>) pt.getActualTypeArguments()[0];
        this.entityClass = (Class<Entity>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    @Override
    public Serializable save(Object entity) throws DataAccessException {
        return hibernateTemplate.save(entity);
    }

    @Override
    public void update(Object entity) throws DataAccessException {
        hibernateTemplate.update(entity);
    }

    @Override
    public List<Entity> loadAll() {
        return hibernateTemplate.loadAll(entityClass);
    }
}
