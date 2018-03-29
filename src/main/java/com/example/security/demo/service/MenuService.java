package com.example.security.demo.service;

import com.example.security.demo.domain.Menu;

import java.util.List;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
public interface MenuService {
    Menu add(Menu menu);
    boolean deleteById(String id);
    Menu findById(String id);
    List<Menu> findAll();
}
