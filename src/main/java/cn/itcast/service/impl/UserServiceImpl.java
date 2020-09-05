package cn.itcast.service.impl;

import cn.itcast.bean.User;
import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DESCRIPTION:
 * STEPS:
 * SUMMARY:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> findByUsernameAndPassword(String username, String password) {
        return userDao.findByUsernameAndPassword(username,password);
    }

    @Override
    public List<User> findBySQL(String username, String password) {
        return userDao.findBySQL(username,password);
    }
}
