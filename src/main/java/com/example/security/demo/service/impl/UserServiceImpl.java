package com.example.security.demo.service.impl;

import com.example.security.demo.dao.UserDao;
import com.example.security.demo.domain.User;
import com.example.security.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.findByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }

    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean deleteById(String id) {
        userDao.deleteById(id);
        return true;
    }

    @Override
    public User update(User user) {

        return userDao.save(user);
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
