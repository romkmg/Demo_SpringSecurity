package com.example.security.demo.domain;

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
public class Menu extends BasicsEntity {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    private String url;//资源URL

    private String name;

    private String parentId;

    private String other;//预留字段

    @ManyToMany(targetEntity = com.example.security.demo.domain.Role.class,mappedBy = "menus",fetch = FetchType.EAGER)
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
