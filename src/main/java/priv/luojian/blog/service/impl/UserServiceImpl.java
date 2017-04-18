package priv.luojian.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import priv.luojian.blog.dao.UserDao;
import priv.luojian.blog.entity.User;
import priv.luojian.blog.service.UserService;

/**
 * Created by Administrator on 2017/3/14.
 */
@Repository
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public void saveUser(User user) {
        userDao.save(user);
    }

    public User getUser(int userId) {
        return userDao.get(userId);
    }
}
