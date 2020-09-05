package cn.itcast.service;

import cn.itcast.bean.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();

    User findById(Long id);

    List<User> findByUsernameAndPassword(String username, String password);

    List<User> findBySQL(String username, String password);

}
