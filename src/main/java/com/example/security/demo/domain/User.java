package com.example.security.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:15
 */
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class User extends BasicsEntity implements UserDetails {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    private String realName;//真实姓名或昵称

    private String username;//用户名

    private String password;//密码

    private boolean enabled;//激活状态

    @JsonIgnore
    @ManyToMany(targetEntity=com.example.security.demo.domain.Role.class,cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinTable(
            name="user_roles",
            joinColumns=@JoinColumn(name="user_id",referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="roles_id",referencedColumnName="id")
    )
    private List<Role> roles;//角色

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {//账户未过期
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {//账户未被锁
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {//密码证书未过期
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", realName='" + realName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", roles=" + roles +
                '}';
    }
}
