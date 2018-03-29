package com.example.security.demo.service.impl;

import com.example.security.demo.dao.RoleDao;
import com.example.security.demo.domain.Role;
import com.example.security.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;


    @Override
    public Role add(Role role) {
        return roleDao.save(role);
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public Role update(Role role) {
        return roleDao.save(role);
    }

    @Override
    public Role findById(String id) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
