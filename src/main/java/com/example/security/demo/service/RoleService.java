package com.example.security.demo.service;

import com.example.security.demo.domain.Role;

import java.util.List;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
public interface RoleService {
    Role add(Role role);
    boolean deleteById(String id);
    Role update(Role role);
    Role findById(String id);
    List<Role> findAll();
}
