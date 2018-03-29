package com.example.security.demo.service.impl;

import com.example.security.demo.dao.MenuDao;
import com.example.security.demo.domain.Menu;
import com.example.security.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    @Override
    public Menu add(Menu menu) {
        return menuDao.save(menu);
    }

    @Override
    public boolean deleteById(String id) {
        menuDao.deleteById(id);
        return true;
    }

    @Override
    public Menu findById(String id) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return menuDao.findAll();
    }
}
