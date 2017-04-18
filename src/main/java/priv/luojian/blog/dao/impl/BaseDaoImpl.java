package priv.luojian.blog.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import priv.luojian.blog.dao.BaseDao;
import priv.luojian.blog.entity.User;

/**
 * Created by Administrator on 2017/3/15.
 */
@Repository
public class BaseDaoImpl<E> implements BaseDao<E> {
    //    装配工厂
    @Autowired
    private SessionFactory sessionFactory;

    protected Class<?> entityClass;
    /**
     * 获取session
     */
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(E entity) {
        getSession().save(entity);
    }

    public E get(int id) {

        return (E)getSession().get(entityClass,id);
    }

    public void update(E entity) {

    }

    public void remove(E entity) {

    }
}
