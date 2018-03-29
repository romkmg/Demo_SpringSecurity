package com.example.security.demo;

import com.example.security.demo.dao.UserDao;
import com.example.security.demo.domain.Menu;
import com.example.security.demo.domain.Role;
import com.example.security.demo.domain.User;
import com.example.security.demo.service.MenuService;
import com.example.security.demo.service.RoleService;
import com.example.security.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Autowired
	UserService userService;
	@Autowired
	UserDao userDao;
	@Autowired
	RoleService roleService;
	@Autowired
	MenuService menuService;

	@Test
	public void addUserTest(){
		User user = new User();
		user.setUsername("admin");
		user.setRealName("管理员");
		user.setPassword("123");
		user.setEnabled(false);
		userService.add(user);
		
		System.out.println(user.toString());
	}
	@Test
	public void addRoleTest(){
		Role role = new Role();
		role.setName("ROLE_ADMIN");
		role.setNameZh("超级管理员");
		roleService.add(role);
		
		System.out.println(role.toString());
	}
	@Test
	public void addMenuTest(){
		Menu menu = new Menu();
		menu.setName("测试");
		menu.setUrl("/test");
		menu.setOther("");
		menuService.add(menu);
		
		System.out.println(menu.toString());
	}
	@Test
	public void addUserRoleTest(){
		User user = userDao.findByUsername("admin");
		List<Role> roles = roleService.findAll();
		user.setRoles(roles);
		userDao.save(user);

		System.out.println(user.toString());
	}
	
	@Test
	public void contextLoads() {
		List<User> userList = userService.findAll();
		for(User user : userList){
			System.out.println(user.toString());
		}
	}

}
