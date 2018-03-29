package com.example.security.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:15
 */
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Role extends BasicsEntity {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    private String name;//角色名按SpringSecurity规范：ROLE_ 开头

    private String nameZh;//角色中文名

    @ManyToMany(targetEntity = com.example.security.demo.domain.User.class,mappedBy = "roles",cascade = {CascadeType.REMOVE,CascadeType.REFRESH},fetch = FetchType.EAGER)
    private List<User> users;

    @ManyToMany(targetEntity = com.example.security.demo.domain.Menu.class)
    @JoinTable(
            name="role_menus",
            joinColumns=@JoinColumn(name="role_id",referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="menus_id",referencedColumnName="id")
    )
    private List<Menu> menus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nameZh='" + nameZh + '\'' +
                ", users=" + users +
                '}';
    }
}
