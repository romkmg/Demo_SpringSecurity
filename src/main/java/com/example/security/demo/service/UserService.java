package com.example.security.demo.service;

import com.example.security.demo.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:15
 */
public interface UserService extends UserDetailsService {
    User add(User user);
    boolean deleteById(String id);
    User update(User user);
    User findById(String id);
    List<User> findAll();
}
