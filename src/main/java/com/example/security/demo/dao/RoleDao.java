package com.example.security.demo.dao;

import com.example.security.demo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:16
 */
public interface RoleDao extends JpaRepository<Role,String> {

}
