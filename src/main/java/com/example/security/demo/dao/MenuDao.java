package com.example.security.demo.dao;

import com.example.security.demo.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
public interface MenuDao extends JpaRepository<Menu,String> {

}
